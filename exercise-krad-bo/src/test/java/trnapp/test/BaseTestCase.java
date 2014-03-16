package train.test;

import java.util.Map;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppClassLoader;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.kuali.rice.core.api.config.property.Config;
import org.kuali.rice.core.api.config.property.ConfigContext;
import org.kuali.rice.core.api.lifecycle.Lifecycle;
import org.kuali.rice.core.api.resourceloader.GlobalResourceLoader;
import org.kuali.rice.core.api.resourceloader.ResourceLoader;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * A base test class which adds the following capabilities to the test harness:
 * 
 * <li>
 *   <ol>Automatically starts an embedded Jetty server which loads the application.</ol>
 *   <ol>Starts a transaction before the test begins and rolls the transaction back after 
 *       the test completes so that nothing is written to the database.</ol>
 * </li>
 * 
 * @author Eric Westfall
 */
public class BaseTestCase extends Assert {

	private static final int DEFAULT_PORT = 8090;
	private static final String CONTEXT_NAME = "/trnapp";
	private static final String WEBAPP_ROOT = "src/main/webapp";
	
	private static Server server;
	
	private TransactionalLifecycle transactionalLifecycle;
	
	@Before
	public void setUp() throws Exception {
		transactionalLifecycle = new TransactionalLifecycle();
		transactionalLifecycle.start();
	}
	
	@After
	public void tearDown() throws Exception {
		try {
			if (transactionalLifecycle != null) {
				transactionalLifecycle.stop();
			}
		} finally {
			transactionalLifecycle = null;
		}
	}
	
	@BeforeClass
	public static void startJettyServer() throws Exception {
		BaseTestCase.server = new Server(DEFAULT_PORT);
		WebAppContext context = new WebAppContext(WEBAPP_ROOT, CONTEXT_NAME);
		server.setHandler(context);
		server.start();
		// establish the GlobalResourceLoader and ConfigContext for the classloader of the test harness
		addWebappsToContext();
	}
	
    /**
     * Adds all ResourceLoaders registered to WebAppClassLoaders to the GlobalResourceLoader.
     * Overrides the current context config with the Config registered to the (last) WebAppClassLoader
     */
    public static void addWebappsToContext() {
        for (Map.Entry<ClassLoader, Config> configEntry : ConfigContext.getConfigs()) {
            if (configEntry.getKey() instanceof WebAppClassLoader) {
                ResourceLoader rl = GlobalResourceLoader.getResourceLoader(configEntry.getKey());
                if (rl == null) {
                    Assert.fail("didn't find resource loader for workflow test harness web app");
                }
                ConfigContext.overrideConfig(Thread.currentThread().getContextClassLoader(), configEntry.getValue());
                GlobalResourceLoader.addResourceLoader(rl);
            }
        }
    }
	
	@AfterClass
	public static void stopJettyServer() throws Exception {
		try {
			if (server != null) {
				server.stop();
			}
		} finally {
			server = null;
		}
	}
	
	private static class TransactionalLifecycle implements Lifecycle {
		
		private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger
				.getLogger(TransactionalLifecycle.class);
		
	    /**
	     * Name of the transaction manager to pull from the GlobalResourceLoader.
	     * This will most likely be a Spring bean name.
	     */
	    public static final String DEFAULT_TRANSACTION_MANAGER_NAME = "transactionManager";
	    	    
	    /**
	     * Returns the PlatformTransactionManager configured on this lifecycle.
	     * If none defined, pulls the transaction manager out of the GlobalResourceLoader
	     * @return the transaction manager in the GlobalResourceLoader
	     */
	    private PlatformTransactionManager getTransactionManager() {
	    	return (PlatformTransactionManager) GlobalResourceLoader.getService(DEFAULT_TRANSACTION_MANAGER_NAME);
	    }

	    private boolean started;
	    private TransactionStatus TRANSACTION_STATUS;

	    public boolean isStarted() {
	        return started;
	    }

	    public void start() throws Exception {
	    	LOG.info("Starting a transaction from TransactionalLifecycle...");
	        DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
	        defaultTransactionDefinition.setTimeout(3600);
	        TRANSACTION_STATUS = getTransactionManager().getTransaction(defaultTransactionDefinition);
	        started = true;
	    }

	    public void stop() throws Exception {
	    	LOG.info("...rolling back transaction from TransactionalLifecycle.");
	        getTransactionManager().rollback(TRANSACTION_STATUS);
	        started = false;
	    }

	}

	
}
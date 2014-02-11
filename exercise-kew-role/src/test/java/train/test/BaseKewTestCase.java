package train.test;

import org.kuali.rice.core.api.config.property.ConfigContext;
import org.kuali.rice.ksb.util.KSBConstants;

public class BaseKewTestCase extends BaseTestCase {

	@Override
	public void setUp() throws Exception {
		super.setUp();
		setMessagingToSynchronous();
	}
	
	/**
	 * In order to facilitate ease of unit testing, we set the messaging to synchronous so
	 * that we don't have to deal with asynchronous workflow processing in the background.
	 */
	private void setMessagingToSynchronous() {
        ConfigContext.getCurrentContextConfig().putProperty(KSBConstants.Config.MESSAGE_DELIVERY, "synchronous");
	}
	
}

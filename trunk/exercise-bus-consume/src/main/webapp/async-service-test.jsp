
<%@page import="org.kuali.rice.ksb.api.KsbApiServiceLocator"%>
<%@page import="train.bookstore.service.EchoService"%>
<%@page import="javax.xml.namespace.QName"%>

<html><body>

<%

QName echoServiceName = new QName("http://service.bookstore.train/", "echoService");
EchoService echoService = (EchoService)KsbApiServiceLocator.getMessageHelper().getServiceAsynchronously(echoServiceName);

int numMessages = 100;

long start = System.currentTimeMillis();

for (int i = 0; i < numMessages; i++) {
	echoService.helloWorld();
}

long end = System.currentTimeMillis();

out.println("Total time to send " + numMessages + " messages: " + (end - start) + " milliseconds");

%>

</body></html>
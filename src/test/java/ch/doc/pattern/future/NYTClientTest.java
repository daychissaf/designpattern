package ch.doc.pattern.future;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NYTClientTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
//		NYTClient client = new NYTClient();
//		client.run();
		System.setProperty("http.proxyHost", "myProxyServer.com");
		System.setProperty("http.proxyPort", "80");
		
		System.setProperty("java.net.useSystemProxies", "true");
		List<Proxy> l = null;
		try {
		  l = ProxySelector.getDefault().select(new URI("http://www.yahoo.com"));
		}
		catch (URISyntaxException e) {
		  e.printStackTrace();
		}

		if (l != null) {
		   for (Proxy proxy : l) {
		      System.out.println("proxy hostname : " + proxy.type());
		      InetSocketAddress addr = (InetSocketAddress) proxy.address();
		      if (addr == null) {
		        System.out.println("No Proxy");
		      } 
		      else {
		        System.out.println("proxy hostname : " + addr.getHostName());
		        System.out.println("proxy port : " + addr.getPort());
		      }
		   }
		}
	}

}

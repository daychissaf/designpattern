package ch.doc.pattern.future;


public class NYTClient {

	public static final String BASE_URL = "http://api.nytimes.com/svc/search/v1/article?format=json&query={query}&api-key={key}";
	public static final String QUERY = "Fire";
	public static final String KEY = "9b21b1a18f974628f493ec1cae6b6cf7:16:69452874";
	
	public void run() {
		System.setProperty("java.net.useSystemProxies", "true");
//		ClientHttpRequestFactory factory;
//		SimpleClientHttpRequestFactory f = new SimpleClientHttpRequestFactory();
//		f.setProxy(proxy);
//		RestTemplate template = new RestTemplate();
//		String response = template.getForObject(BASE_URL, String.class, QUERY, KEY);
//		System.out.println(response);
	}
}

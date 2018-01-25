package ch.doc.pattern.future;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import org.junit.Before;
import org.junit.Test;

public class FileStatsTest {

	public static final String PATH = "C:\\dev\\formation";
	public static final String[] paths = new String[] {
		"C:\\dev\\formation",
		"C:\\Users",
		"C:\\Program Files"
	};
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws IOException {
		long time = System.currentTimeMillis();

		asynchronous();
//		synchronous();
		
		long result = System.currentTimeMillis() - time;
		System.out.println("total time to process :" + result / 1000);
	}

	private void synchronous() throws IOException {
		for (String path : paths) {
			
			FileStats stats = new FileStats(path);
			stats.run();
		}
	}

	private void asynchronous() {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		FutureTask<Integer> future1 = new FutureTask<>(new FileStats(paths[0]));
		FutureTask<Integer> future2 = new FutureTask<>(new FileStats(paths[1]));
		FutureTask<Integer> future3 = new FutureTask<>(new FileStats(paths[2]));
		
		executor.execute(future1);
		executor.execute(future2);
		executor.execute(future3);
		
		while(true) {
			if (future1.isDone() && future2.isDone() && future3.isDone()) {
				break;
			}
//			future1.get();
		}
	}

}

package ch.doc.pattern.future;

import static java.nio.file.Files.isDirectory;
import static java.nio.file.Files.isRegularFile;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.concurrent.Callable;

public class FileStats implements Callable<Integer> {

	public static final String PATH = "C:\\dev\\formation";
	private final String path;

	public FileStats(String path) {
		if (path == null) {
			this.path = PATH;
		} else {
			this.path = path;
		}
	}

	@Override
	public Integer call() throws Exception {
		return run();
	}

	public int run() throws IOException {
		FileCounter counter = new FileCounter(path);
		counter.browse();
		System.out.println(path + " file count is " + counter.getCount());
		return counter.getCount();
	}

	public static class FileCounter {
		private final String root;
		private int count;

		public FileCounter(String root) {
			this.root = root;
			this.count = 0;
		}

		public void browse() throws IOException {
			browse(FileSystems.getDefault().getPath(root));
		}

		private void browse(Path path) throws IOException {
			count(path);
			if (isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
				try {
					DirectoryStream<Path> stream = Files
							.newDirectoryStream(path);
					for (Path subPath : stream) {
						browse(subPath);
					}
				} catch (AccessDeniedException ex) {

				}
			}
		}

		private void count(Path path) {
			if (isRegularFile(path, LinkOption.NOFOLLOW_LINKS)) {
				count++;
			}
		}

		public int getCount() {
			return count;
		}

	}
	// ExecutorService executor = ...
	// ArchiveSearcher searcher = ...
	// void showSearch(final String target)
	// throws InterruptedException {
	// Future<String> future
	// = executor.submit(new Callable<String>() {
	// public String call() {
	// return searcher.search(target);
	// }});
	// displayOtherThings(); // do other things while searching
	// try {
	// displayText(future.get()); // use future
	// } catch (ExecutionException ex) { cleanup(); return; }
	// }

}
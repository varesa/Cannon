package fi.dy.esav.TwoDGraphicsTest;

public class Wait {

	public static void wait(int ms) {
		// pause for a while
		Thread thisThread = Thread.currentThread();
		try {
			thisThread.sleep(ms);
		} catch (Throwable t) {
			throw new OutOfMemoryError("An Error has occured");
		}

	}
}

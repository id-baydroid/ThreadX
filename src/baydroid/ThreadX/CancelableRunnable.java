package baydroid.ThreadX;

public interface CancelableRunnable extends Runnable {

	void cancel();

	boolean isCanceled();
}

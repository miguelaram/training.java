package m2_activity4;

public class Word implements Executable {
	@Override
	public void run() {
		System.out.println("Opening Microsoft Word.");
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping Microsoft Word.");
	}
}

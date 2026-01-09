package m2_activity4;

public class Excel implements Executable {
	@Override
	public void run() {
		System.out.println("Opening Microsoft Excel.");
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping Microsoft Excel.");
	}
}

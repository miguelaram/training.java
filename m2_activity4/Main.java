package m2_activity4;

public class Main {

	public static void main(String[] args) {
		Executable msexcel = new Excel();
		Executable msword = new Word();
		
		run(msexcel);
		run(msword);
		
		stop(msexcel);
		stop(msword);
	}
	private static void run(Executable program) {
		program.run();
	}
	private static void stop(Executable program) {
		program.stop();
	}
}

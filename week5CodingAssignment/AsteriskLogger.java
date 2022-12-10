package week5CodingAssignment;

public class AsteriskLogger implements Logger {
	
	public void log (String log) {
		System.out.println("***" + log + "***");
	}

	public void error(String error) {
		System.out.println("****************");
		System.out.println("*** ERROR: "+ error + "***");
		System.out.println("****************");
	}
}

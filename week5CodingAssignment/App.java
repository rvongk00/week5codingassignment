package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger asterLog = new AsteriskLogger();
		asterLog.log("Hello");
		asterLog.error("Bye");
		
		SpacedLogger spacedLog = new SpacedLogger();
		spacedLog.log("Week 5");
		spacedLog.error("Coding Assignment");
		
	}
}

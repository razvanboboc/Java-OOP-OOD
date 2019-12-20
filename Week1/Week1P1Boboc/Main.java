import java.io.IOException;

/*
 * This is the class that starts
 * the application.
 */
public class Main {
	public void start() throws IOException {
		PersonSets personsets = new PersonSets();
		personsets.inputPersons();
		personsets.outputPersons();
		
	}
	public static void main (String[] args) throws IOException {
			Main app = new Main();
			app.start();
	}
}

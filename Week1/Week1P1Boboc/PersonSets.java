import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class PersonSets {

	private static final int maxarraylength = 4;
	private Set<Domain> listOfPersons = new HashSet<Domain>();

	private String[] InputFile() throws IOException {
		String[] stringsFromFile = ReadFromFile.readLinesFromTextFile("W1P1input.txt");
		return stringsFromFile;
	}

	public void inputPersons() throws IOException {
		String[] stringsFromFile = InputFile();
		/*
		 * For each string, go through array of strings.
		 */
		for (String string : stringsFromFile) {
			/*
			 * We split current read string by getting rid of the ", " 
			 * We verify if its length is equal to 4, or 3 and then add
			 * it to the set of objects. 
			 */
			String[] stringsAfterSplit = string.split(", ");
			if (stringsAfterSplit.length == maxarraylength) {
				Domain person = new Domain(stringsAfterSplit[0], stringsAfterSplit[1], stringsAfterSplit[2],
						stringsAfterSplit[3]);
				listOfPersons.add(person);
			} else {
				Domain person = new Domain(stringsAfterSplit[0], stringsAfterSplit[1], stringsAfterSplit[2]);
				listOfPersons.add(person);
			}
		}
	}
    /*
     * Method used to print all person objects.
     * Enhanched for loop. It goes through every object
     * in given set.
     */
	public void outputPersons() {
		for (Domain person : listOfPersons) {
			System.out.println(person.printPerson());
		}
	}

}

/*
 * This is the class which takes
 * in all the information about the persons.
 */
public class Domain {
	private String firstName;
	private String lastName;
	private String dob;
	private String dod;

	public Domain(String firstName, String lastName, String dob, String dod) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.dod = dod;
	}

	public Domain(String firstName, String lastName, String dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.dod = null;
	}

	public String printPerson() {
		if(dod != null) {
			return firstName + " " + lastName + " (" + dob + " - " + dod + ")";
		}else {
			return firstName + " " + lastName + " " + dob;
		}
		
	}

}

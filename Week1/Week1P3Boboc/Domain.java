

public class Domain {
	/*
	 * Variables used to store data.
	 */
	private String nameOfDomain;
	private String ownership;
	private String host;
	/*
	 * Method used to store data in local variables.
	 */
	public Domain(String nameOfDomain, String ownership, String host) {
		this.nameOfDomain = nameOfDomain;
		this.ownership = ownership;
		this.host = host;
	}
	/*
	 * Methods used to return specific data
	 * about the domain.
	 */
	public String returnName() {
		return nameOfDomain;
	}

	public String returnOwner() {
		return ownership;
	}

	public String returnHost() {
		return host;
	}
	/*
	 * Mehods used to change specific data
	 * about the domain.
	 */
	public void changeName(String name) {
		this.nameOfDomain = name;
	}

	public void changeOwner(String ownership) {
		this.ownership = ownership;
	}

	public void changeHost(String host) {
		this.host = host;
	}

	/*
	 * Message to be displayed when we go through every
	 * object of type domain.
	 */
	public String print() {
		return "Domain: " + returnName() + " || Owner: " + returnOwner() + " || Host: " + returnHost();
	}

}

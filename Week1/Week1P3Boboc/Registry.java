
import java.util.HashSet;
import java.util.Set;

public class Registry {
	/*
	 * We use a set to store the objects of type domain.
	 * It is useful because it doesn't allow duplicates.
	 */
	private Set<Domain> domainsDatabase = new HashSet<Domain>();
	/*
	 * Method used for the creation of the new domain.
	 * It receives the data from the registrar.
	 */
	public void domainCreation(String[] domainDataFromRegistrar) {
		/*
		 * Variable used to determine whether
		 * the the domain entry can be created.
		 */
		boolean condition = true;
		/*
		 * We go through every object contained in
		 * the set, and verify if the given name 
		 * and IP of the host matches any of those
		 * located in the given set.
		 */
		for (Domain domain : domainsDatabase) {
			if (domainDataFromRegistrar[0] == domain.returnName()) {

				System.out.println("This domain name already exists, try again!");
				condition = false;
				break;
				/*
				 * If it is found in the Database, then the loop will be stopped.
				 */
			} else if (domainDataFromRegistrar[2] == domain.returnHost()) {

				System.out.println("This host already exists, try again!");
				condition = false;
				break;
			}

		}
		/*
		 * If the condition is still true,
		 * a new entry in the database will be generated.
		 * We add every 
		 */
		if (condition) {
			System.out.println("Creation succesful! New domain entry: " + domainDataFromRegistrar[0]);
			newEntry(new Domain(domainDataFromRegistrar[0], domainDataFromRegistrar[1], domainDataFromRegistrar[2]));
		}
	}
	/*
	 * Method used to add domains to the Database.
	 */
	public void newEntry(Domain domain) {
		domainsDatabase.add(domain);
	}
	/*
	 * This method goes through every object of type domain
	 * in the database and accesses the print method located
	 * in the domain class, which prints the domains.
	 */
	public void printDomains() {
		for (Domain domain : domainsDatabase) {
			System.out.println(domain.print());
		}
	}

}

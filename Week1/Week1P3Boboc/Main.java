
public class Main {
	public void start() {
		/*
		 * We create some domains which will
		 * be subsequently added to the registry.
		 */
		Domain domain1 = new Domain("Cauldron", "Dropbox", "192.167.1.1");
		Domain domain2 = new Domain("Sargon", "Google", "198.163.1.2");
		Domain domain3 = new Domain("Ytiks", "Facebook", "195.165.1.3");

		Registry registry = new Registry();
		/*
		 * We add the domains in the domain Database.
		 */
		registry.newEntry(domain1);
		registry.newEntry(domain2);
		registry.newEntry(domain3);
		/*
		 * The objects of type customer, reseller 
		 * and registrar will be used locally.
		 * We also pass the parameters regarding
		 * the information about the customer to the
		 * object customer.
		 */
		Customer customer = new Customer("DomainX", "Amazon", "191.127.1.1");
		Reseller reseller = new Reseller();
		Registrar registrar = new Registrar();
		/*
		 * We establish the connection
		 * in this order: customer, reseller, registrar, registry.
		 */
		customer.connectToReseller(reseller);
		reseller.connectToRegistrar(registrar);
		registrar.connectToRegistry(registry);
		/*
		 * We print the final domains present in the database
		 * after domain creation.
		 */
		registry.printDomains();

	}
	/*
	 * In the main method we start the program.
	 */
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}

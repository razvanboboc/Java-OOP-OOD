
public class Reseller {
    /*
     * Array of strings used to store data from the customer.
     */
	private String[] domainDataFromCustomer;
	/*
	 * The information received is stored in array of strings.
	 */
	public void receiveDomainDataFromCustomer(String[] domainDataCustomer) {
		this.domainDataFromCustomer = domainDataCustomer;
	}
	/*
	 * Method used to send data to the registar.
	 */
	public void connectToRegistrar(Registrar registrar) {

		registrar.receiveDomainDataFromReseller(domainDataFromCustomer);

	}

}

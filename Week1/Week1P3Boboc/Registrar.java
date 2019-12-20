

public class Registrar {
	/*
	 * Array of strings used to store domain data.
	 */
	private String[] domainDataFromReseller;
	/*
	 * The date is received via this method.
	 */
	public void receiveDomainDataFromReseller(String[] domainDataFromReseller) {
		this.domainDataFromReseller = domainDataFromReseller;
	}
	/*
	 * It connects to the registry and sends the data received.
	 */
	public void connectToRegistry(Registry registry) {

		registry.domainCreation(domainDataFromReseller);
	}

}

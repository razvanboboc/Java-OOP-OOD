
public class Customer {
	/*
	 * The parameters of a given domain 
	 * will be at a maximum of 3, to store the name, owner name and hostIP.
	 */
	private static final int maxarraylength = 3;
	private String[] domainData;
	/*
	 * We store the given parameters in an array of strings.
	 */
	public Customer(String domainName, String owner, String host) {

		domainData = new String[maxarraylength];
		domainData[0] = domainName;
		domainData[1] = owner;
		domainData[2] = host;

	}
	/*
	 * By using this method, we send the domain data to the reseller.
	 */
	public void connectToReseller(Reseller reseller) {
		reseller.receiveDomainDataFromCustomer(domainData);
	}

}


public class PrimeNumbers {

	public void start(int upperBound) {

		boolean primes[] = new boolean[upperBound + 1];
		/*
		 * We go through every number and mark them as prime.
		 */
		for (int i = 2; i <= upperBound; i++) {
			primes[i] = true;
		}
		/*
		 * We go through every number and verify for each loop
		 * if its square is present within the interval.
		 */
		for (int i = 2; i * i <= upperBound; i++) {
			/*
			 * If given number is prime by default..
			 */
			if (primes[i] == true) {
				/*
				 * We go through every multiple of that given number
				 * and mark it as false in prime array.
				 */
				for (int j = 2 ; j <= upperBound; j++) {
					if(j * i < primes.length)
						primes[j * i] = false;
				}

			}
		}
		for (int i = 1; i <= upperBound; i++) {
			if (primes[i] == true)
				System.out.print(i + "-PRIME, ");
			else
				System.out.print(i + ", ");
		}
	}

}

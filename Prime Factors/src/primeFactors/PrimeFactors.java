package primeFactors;

import java.util.ArrayList;

public class PrimeFactors {

	/**
	 * Creates prime factor list for input integer
	 * 
	 * @param i
	 * @return
	 */
	public static java.util.List<Integer> generate (int i) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		if(i > 1){
			int remainder = i%2;
			if(remainder == 0 && i != 2){
				primeFactors.add(2);
				primeFactors.add(i/2);
			}
			else{
				primeFactors.add(i);
			}
		}
		return primeFactors;
	}

	
}

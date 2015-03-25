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
		while(i%2 == 0){
			primeFactors.add(2);
			i = i/2;
		}	
		while(i%3 ==0){
			primeFactors.add(3);
			i = i/3;
		}
		if(i > 1){
		primeFactors.add(i);
		}
		return primeFactors;
	}

}
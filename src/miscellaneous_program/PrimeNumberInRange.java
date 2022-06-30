package miscellaneous_program;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberInRange {
	List<Integer> primeNoList = new ArrayList<>();
	
	public boolean isPrime(int number) {
		if(number<=1) {
			return false;
		}
		
		for(int i=2;i<=number/2;i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}

	public void primeNos(int start, int end) {
		for(int i=start; i<=end; i++) {
			if(isPrime(i)) {
				primeNoList.add(i);
			}
		}
		
		System.out.println(primeNoList);
	}
	
	public static void main(String[] args) {
		PrimeNumberInRange pr = new PrimeNumberInRange();
		pr.primeNos(1, 100);
	}
}

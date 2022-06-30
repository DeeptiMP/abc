package miscellaneous_program;

public class CheckPrimeNumber_1 {

	public boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % 2 == 0) {
				return false;
			}
		}

		return true;
	}

	public void primeNumberCheck(int number) {
		if(isPrime(number)) {
			System.out.println(number + "-->  is a prime number");
		}
		else {
			System.err.println(number + "-->  is not a prime number");
		}
	}

	public static void main(String[] args) {
		CheckPrimeNumber_1 pn = new CheckPrimeNumber_1();
		pn.primeNumberCheck(1);
		pn.primeNumberCheck(3);
		pn.primeNumberCheck(5);
		pn.primeNumberCheck(100);
		pn.primeNumberCheck(17);
		pn.primeNumberCheck(200);
		pn.primeNumberCheck(2);
		
	}
}

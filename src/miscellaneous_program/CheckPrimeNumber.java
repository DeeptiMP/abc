package miscellaneous_program;

public class CheckPrimeNumber {
	

	public void isNumberPrime(int number) {
		int flag = 0;
		if (number == 0 || number == 1) {
			flag=1;
		} else if (number == 2 || number == 3) {
			flag = 0;
		} else {
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					flag = 1;
					break;
				}

			}
		}
		
		if(flag == 1) {
			System.err.println(number + " --> Number is not a prime number");
		}
		else {
			System.out.println(number + " --> Number is a prime number");
		}
	}

	public static void main(String[] args) {
		CheckPrimeNumber np = new CheckPrimeNumber();
		np.isNumberPrime(3);
		np.isNumberPrime(5);
		np.isNumberPrime(100);
		np.isNumberPrime(14);
		np.isNumberPrime(19);
	}
}

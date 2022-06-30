package miscellaneous_program;

public class ReverseNumber {
//Write a function to reverse a number in Java?

	public void reverseNumber(int number) {
		int revNum = 0;
		while (number >= 1) {
			int rem = number % 10;
			revNum = 10 * revNum + rem;
			number = number / 10;
		}
		
		System.out.println("Reversed number is : "+revNum);
	}

	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		rn.reverseNumber(110);
	}
}

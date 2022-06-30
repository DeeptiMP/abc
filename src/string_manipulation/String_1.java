package string_manipulation;

public class String_1 {
//Write Java code to get rid of multiple spaces from a string?

	public void removeMultipleSpaces(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			System.out.println("Input is either NULL or EMPTY");
		} else if (inputString.length() == 1) {
			System.out.println(inputString);
		} else {
			inputString = inputString.replaceAll("[\\s]+", " ");
			System.out.println(inputString.trim());
		}
	
	}

	public static void main(String[] args) {
		new String_1().removeMultipleSpaces(null);
	}
}

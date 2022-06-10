package practice_pattern;

public class Pattern_14 {
public static void main(String[] args) {
	
	int m = 10;
	int space=1;
	
	for(int i=m;i>=1;i--) {
		for(int k=2;k<=space;k++) {
			System.out.print(" ");
		}
		space++;
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
}
}

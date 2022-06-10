package practice_pattern;

public class Pattern_18 {
public static void main(String[] args) {
	int m=15;
	int space = m-1;
	
	for(int i=1;i<=m;i++) {
		for(int j=space;j>=1;j--) {
			System.out.print(" ");
		}
		space--;
		
		System.out.print("*");
		System.out.println();
	}
		
}
}

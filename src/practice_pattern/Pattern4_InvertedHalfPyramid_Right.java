package practice_pattern;

public class Pattern4_InvertedHalfPyramid_Right {
public static void main(String[] args) {
	int m=10;
	
	for(int i=m;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}

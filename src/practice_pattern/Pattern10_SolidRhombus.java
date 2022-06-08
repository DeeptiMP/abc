package practice_pattern;

public class Pattern10_SolidRhombus {
public static void main(String[] args) {
	int m=10;
	int space = m-1;
	
	for(int i=1;i<=m;i++) {
		for(int j=space;j>=1;j--) {
			System.out.print(" ");
		}
		space--;
		for(int k=1;k<=m;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}

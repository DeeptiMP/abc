package practice_pattern;

public class Pattern_2_HollowRectangle {
public static void main(String[] args) {
	int m = 6;
	int n = 20;
	
	for(int i=1;i<=m;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1 || j==1 || i==m || j==n) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
				
		}
		System.out.println();
	}
	
}
}

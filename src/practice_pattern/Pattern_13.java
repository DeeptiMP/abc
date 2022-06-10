package practice_pattern;

public class Pattern_13 {
public static void main(String[] args) {
	
	int m=8;
	
	for(int i=1;i<=m;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int k=(m-1);k>=1;k--) {
		for(int l=1;l<=k;l++) {
			System.out.print("* ");
		}
		System.out.println();
	}
		
}
}

package practice_pattern;

public class Pattern11_Pyramid_Numbers {
public static void main(String[] args) {
	
	int m=9;
	int space = m-1;
	
	for(int i=1;i<=m;i++) {
		for(int j=space;j>=1;j--) {
			System.out.print(" ");
		}
		space--;
		for(int k=1;k<=i;k++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}

package practice_pattern;

public class Pattern12_Palindromic_Number_Pyramid {
public static void main(String[] args) {
	int m=7;
	int space = m-1;
	
	for(int i=1;i<=m;i++) {
		for(int j=space;j>=1;j--) {
			System.out.print(" " );
		}
		space--;
		
		for(int k=i;k>=1;k--) {
			System.out.print(k+"");
		}
		
		for(int l=2;l<=i;l++)
		{
			System.out.print(l+"");
		}
		
		System.out.println();
	}
		
	
}
}

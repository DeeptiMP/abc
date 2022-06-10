package practice_pattern;

public class Pattern_15 {
public static void main(String[] args) {
	int m=8;
	int space=m-1;
	int star =m-1;
	
	System.out.println("m value is : "+m);
	System.out.println("space value is : "+space);

	for(int i=1;i<=m;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		space--;
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=1;i<=(m-1);i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		space--;
		for(int k=star;k>=1;k--)
		{
			System.out.print("*");
		}
		star--;
		System.out.println();
	}
}
}

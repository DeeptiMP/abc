package practice_pattern;

public class Pattern9_01_Triangle {
public static void main(String[] args) {
	int m=10;
	
	for(int i=1;i<=m;i++) {
		for(int j=1;j<=i;j++) {
			if((i+j)%2==0) {
			System.out.print(1+" ");
			}
			else {
				System.out.print(0+" ");
			}
		}
		System.out.println();
	}
}
}

package practice_pattern;

public class Pattern8_FloydsTriangle {

	public static void main(String[] args) {
		int m=10;
		int count=1;
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
				System.out.println();
		}
			

	}

}

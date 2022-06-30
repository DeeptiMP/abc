package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	
	public void removeDuplicateElements(int []a) {
		List<int[]> list = Arrays.asList(a);
	}
	
	
	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		 Integer a[] = new Integer[] { 10, 20, 30, 40 };
		 
         // Getting the list view of Array
         List<Integer> list = new ArrayList<>(Arrays.asList(a));
         list.add(67);
         
         System.out.println(list);
	}
}

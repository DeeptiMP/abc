package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsInList {
// Write code to sort the list of strings using Java collection?
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Apple","Mango","Sapota","Lichi","Pine Apple","Pappaya","Banana","Guava"));
		//1. Using Collections.sort()
		System.out.println("=====Using Collections.sort()=====");
		Collections.sort(list);
		System.out.println(list);
		
		//2. Using sorted
		System.out.println("===== Using stream , sorted() =====");
		List<String> list1 = new ArrayList<>(Arrays.asList("Apple","Mango","Sapota","Lichi","Pine Apple","Pappaya","Banana","Guava"));
		List<String> sortedList = list1.stream().sorted().collect(Collectors.toList());
		//sortedList.forEach(System.out::print);
		System.out.println(sortedList);
		
		//3. sorted with Comparator (Ascending)
		System.out.println("===== sorted with Comparator (Ascending) =====");
		List<String> list2 = new ArrayList<>(Arrays.asList("Apple","Mango","Sapota","Lichi","Pine Apple","Pappaya","Banana","Guava"));
		list2.sort((o1,o2)-> o1.compareTo(o2));
		System.out.println(list2);
		
		//4. sorted with Comparator (Descending)
		System.out.println("===== sorted with Comparator (Descending) =====");
		List<String> list3 = new ArrayList<>(Arrays.asList("Apple","Mango","Sapota","Lichi","Pine Apple","Pappaya","Banana","Guava"));
		list3.sort((o1,o2)-> o2.compareTo(o1));
		System.out.println(list3);
		
		List<String> list4 = new ArrayList<>(Arrays.asList("Apple","Mango","Sapota","Lichi","Pine Apple","Pappaya","Banana","Guava"));
		//5. Using Collections.sort() and Collections.reverseOrder()
		System.out.println("=====Using Collections.sort() and Collections.reverse() =====");
		Collections.sort(list4, Collections.reverseOrder());
		System.out.println(list4);
		
		//6. Using stream , sorted and Comparator.reverseOrder()
		System.out.println("===== Using stream , sorted() and comparator =====");
		List<String> list5 = new ArrayList<>(Arrays.asList("Apple","Mango","Sapota","Lichi","Pine Apple","Pappaya","Banana","Guava"));
		List<String> sortedListt = list5.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//sortedList.forEach(System.out::print);
		System.out.println(sortedListt);
		
	}
}

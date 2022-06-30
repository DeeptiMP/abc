package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Remove duplicate elements from a list
public class RemoveDuplicateFromList {

	public List<Integer> removeDuplicates(List<Integer> list) {
		Set<Integer> set1 = new LinkedHashSet<>(list);
		List<Integer> list2 = new ArrayList<>(set1);
		return list2;
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(4, 3, 2, 3, 5, 4, 3, 2, 1, 7, 8, 3, 2));
		System.out.println(new RemoveDuplicateFromList().removeDuplicates(list1));
	}
}

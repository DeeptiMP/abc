package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamForEach {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<>(Arrays.asList("Apple","Guava","Pappaya","Lichi","Mango"));
	list.stream().forEachOrdered(e -> System.out.print(e+ " , "));
	
	
	System.out.println();
	Map<String,Integer> map = new HashMap<>();
	map.put("Apple", 3);
	map.put("Mango", 7);
	map.put("Pappaya", 2);
	map.put("Guava", 9);
	map.put("Lichi", 1);
	
	
	map.entrySet().stream().forEach(e -> System.out.print(e+ " "));
}
}

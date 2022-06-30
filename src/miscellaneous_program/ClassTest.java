package miscellaneous_program;

import java.util.HashMap;
import java.util.Map;

public class ClassTest {
public static void main(String[] args) {
	String str = "Deepti Priyadarshini";

	Map<Character,Integer> map = new HashMap<>();

	for(int i=0; i<str.length();i++){

	if(map.containsKey(str.charAt(i))){
	int value = map.get(str.charAt(i));
	map.put(str.charAt(i),(value+1));

	}

	else{
	map.put(str.charAt(i),1);
	}
	}

	for(Map.Entry<Character,Integer> c: map.entrySet()){

	System.out.println(c.getKey() +" : "+c.getValue());

	


	}
}}

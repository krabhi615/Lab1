package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		
		/*
		 * List<Integer> list = Arrays.asList(12,13,45,87);
		 * list.forEach((e)->System.out.print(e + " "));
		 */
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "abhishek");
		map.put(1002, "bhsishs");
		map.put(1003, "sjsosh");
		map.put(1004, "psfshsg");
		map.put(1005, "wodjdodj");
		
		List list = new ArrayList<Integer>( map.keySet());
		list.forEach(System.out::print);
		
		

	}
 
}

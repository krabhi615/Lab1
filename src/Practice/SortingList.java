package Practice;

import java.util.Arrays;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		   List<Integer> list = Arrays.asList(12,58,78,89,68,79,69,45);
		   
		   list.stream().
		                sorted().
		                       forEach(e->System.out.println(e));

	}

}

package homeAssignments_3weekday3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 3,2,11,4,6,7);
		int SecondLargest= list1.size()-2;		
		Collections.sort(list1);
		System.out.println("List after sort: "+list1);
		System.out.println("Second largest value in the given list is: "+list1.get(SecondLargest));
		
	}

}

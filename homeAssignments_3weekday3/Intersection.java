package homeAssignments_3weekday3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1= new ArrayList<>();
		List<Integer> list2= new ArrayList<>();
		
		Collections.addAll(list1,3,2,11,4,6,7);
		Collections.addAll(list2, 1,2,8,4,9,7);
		
		System.out.println("Values in list1 are "+list1);
		System.out.println("Values in list2 are "+list2);
		list1.size();
		List<Integer> list3= new ArrayList<>();
		for (int i=0;i<list1.size();i++)
		{
			for(int j=0;j<list2.size();j++)
			{
				if(list1.get(i)==list2.get(j))
				{
					Collections.addAll(list3,list1.get(i));
					break;
				}
			}
			
		}
		System.out.println("Duplicated values are "+list3);
	}

}

package homeAssignments_3weekday3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 1,2,3,4,7,6,8,9,11,13,14,16);
		Collections.sort(list1);
		System.out.println("List after sort: "+list1);
		List<Integer> missing = new ArrayList<Integer>();
		for (int i=1;i<=list1.size()-1;i++)
		{
			
				if((list1.get(i))-(list1.get(i-1))!=1)
				{
					Collections.addAll(missing, list1.get(i-1)+1);
				}
			}
		System.out.println("Missing values are "+ missing);
			
		}
	}



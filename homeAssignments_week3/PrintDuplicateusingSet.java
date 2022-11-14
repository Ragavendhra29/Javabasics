package homeAssignments_week3;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateusingSet {
	
public static void main(String[] args) throws InterruptedException {
	
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int count = arr.length;
	System.out.println("Duplicate values in the given array are");
	Set<Integer> set = new LinkedHashSet<Integer>();
	for (int i=0; i<=count-1;i++) {
		boolean duplicate = set.add(arr[i]);
		if (!duplicate) {
			System.out.println(arr[i]);
		}
		
	}	
}
}

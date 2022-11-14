package homeAssignments_week3;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	
public static void main(String[] args) throws InterruptedException {
	
	String text = "We learn java basics as part of java sessions in java week1string";
	String[] split = text.split(" ");
	
	
	Set<String> set = new LinkedHashSet<String>();
	for (String string : split) {
		set.add(string);
	}
	System.out.println(set);
	
}
}

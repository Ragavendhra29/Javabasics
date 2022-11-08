package homeAssignments_week3day3;

public class Automation extends MultipleLanguage{
	@Override
	public void Java() {
		System.out.println("This is Inheritance class method - Java");
	}

	@Override
	public void Selenium() {
		System.out.println("This is Inheritance class method - Selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("This is abstract class method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation obj = new Automation();
		obj.Java();
		obj.Selenium();
		obj.python();
		obj.ruby();
		

	}

	
}

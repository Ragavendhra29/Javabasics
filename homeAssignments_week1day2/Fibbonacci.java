package homeAssignments_week1day2;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibo=0;
		int firstnum=0;
		int secnum=1;
		System.out.println(firstnum+" ");
		System.out.println(secnum+" ");
		for (int i=1; i<=11;i++)
		{
			fibo = firstnum+secnum;			
			if(fibo<=56)
			{
				System.out.println(fibo +" ");
			}
			
			firstnum = secnum;
			secnum = fibo;			
		}	

	}
}

package homeAssignments_week1day2;

public class IsPrime 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = 2259;
		int count = 0;
		for(int i = 2; i<num;i++)
		{
			
			if(num % i==0)
			{
				count++;
			}
			}
			if (count==0)
			{
				System.out.println("given number is a prime number");
			}
			else
			{
				System.out.println("given number is not a prime number");
			}
			}
	}

	

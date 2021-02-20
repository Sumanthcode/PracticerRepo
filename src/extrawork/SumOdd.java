package extrawork;

public class SumOdd {
	public static boolean isOdd(int number)
	{
	
		if(number%2==1)
		{
		   return true;
		}
		else
			return false;
	}


	public static int sumOdd(int start, int end)
	{
		int sum=0;
		
		for(int i=start;i<=end;i++)
		{
			if(start == end)
			{
				return -1;
				
			}
			else if(isOdd(i))
			{
				sum=sum+i;

			}
			

		}
		return sum;
	}
}

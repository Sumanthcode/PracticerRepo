package extrawork;

public class C30 {

	public static void main(String[] args) {
		System.out.println(sumOfFirstAndLastDigit(2435));
		
		

	}
	
	public static int sumOfFirstAndLastDigit(int number)
	{
		if(number>0){
			
			int firstdigit=number;
			int lastdigit=number%10;
			
			while(firstdigit>=10)
			{
				firstdigit=firstdigit/10;
			}
			return firstdigit + lastdigit;
		}
			else
			return -1;
			
			
		}
		
		
	}

	




public class Multiples_of_3_and_5 {

	public static void main(String[] args)
    {
		int numbers;
		int sum = 0;
		int temp = 0;
		for (numbers = 1; numbers < 1000; numbers++)
		{
			if ((numbers % 3) == 0 || (numbers % 5) == 0)
			{
				temp = numbers;
				sum = sum + temp;
			}		
		}
		System.out.println(sum);
		
	}

}

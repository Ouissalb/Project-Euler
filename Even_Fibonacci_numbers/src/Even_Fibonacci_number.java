public class Even_Fibonacci_number {

	public static void main(String[] args)
	{
		int sum = 0;
		int number_of_terms = 60;
		int first_term = 0;
		int second_term = 1;
		int next_term = 0;
		int i;
		
		for (i = 1; i < number_of_terms; i++)
		{
			next_term = first_term + second_term;
			first_term = second_term;
			second_term = next_term;		
			if( next_term % 2 == 0)
			{
				sum += next_term;
			}
			if ( next_term >= 4000000)
				break;
		}
		
		
		System.out.println(sum);				
	}

}

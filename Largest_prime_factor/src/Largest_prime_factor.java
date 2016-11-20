import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Largest_prime_factor {

	public static void main(String[] args) 
	{
		//ArrayList primesArray = new ArrayList();
		ArrayList factorArray = new ArrayList();
		ArrayList primesArray = new ArrayList();
		long largest = 1;
	    long number = 600851475143L;
		long i, j, k;
		
		//the array list factorArray will have all factors of number
		/*for (i = 2; i < number; i++)
		{
		
			if( number % i == 0)
			{
				factorArray.add(i);
				System.out.println(factorArray);
				
			}
		}*/
		
		for (i=2; i < number; i++)
		{
			if(isPrime(i))
			{
				if( number % i == 0)
				{
					factorArray.add(i);
					
					
				}
				//primesArray.add(i);
			}	
			//System.out.println(primesArray);
		}
		System.out.println(factorArray);
		
		
		
		//System.out.println(factorArray);
		
		//the array list factorArray will now have only prime factors
		/*for (i = 2; i < 100000; i++)
		{
		 if (!isPrime(i))
		 {
			 factorArray.remove(i);
			 System.out.println(factorArray);
	     }
		}
		*/
		
		System.out.println(Collections.max(factorArray));
	}




	public static boolean isPrime(long n) 
	{
	    // fast even test.
	    if(n > 2 && (n & 1) == 0)
	       return false;
	    // only odd factors need to be tested up to n^0.5
	    for(int i = 3; i * i <= n; i += 2)
	        if (n % i == 0) 
	            return false;
	    return true;
	}	

}

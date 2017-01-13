import java.io.*;
public class minPrimeNum 
{
	static int isPrime(int n)
	{
		if(n==1)
			return 0;
		int flag=0;
		int lt=(int)(Math.sqrt(n)+1);
		for(int i=2;i<lt;i++)
		{
			if(n%i==0)
				flag = 1;
		}
		return(Math.abs(flag-1));	/*	Returns 1 if prime, 0 if not */
	}
	
	public static void main(String args[]) throws IOException
	{
		System.out.print("Enter a number : ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		int min=-1;
		
		while(num>0)
		{
			int d= num%10;
			num = num/10;
			if(isPrime(d)==1)
			{
				if(min==-1)
					min=d;
				else if(d<min)
					min=d;
			}
		}
		
		if(min==-1)
			System.out.println("There are no primes in this number!");
		else
			System.out.println("The minimum Prime Number is :"+min);
	}
}

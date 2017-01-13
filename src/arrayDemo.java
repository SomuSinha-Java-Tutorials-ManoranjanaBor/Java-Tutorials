import java.io.*;
public class arrayDemo 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[10]; 
		int sum = 0;
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the value for the "+(i+1)+" element :");
			a[i]=Integer.parseInt(in.readLine());
		}
		
		for(int i=0;i<5;i++)
		{
			sum+=a[i];
		}
		
		System.out.println("The sum = "+sum);
	}
}

import java.io.*;
public class exceptionHandling 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number :");
		int a = Integer.parseInt(in.readLine());
		System.out.print("Enter another number :");
		int b = Integer.parseInt(in.readLine());
		
		try
		{
			System.out.println("Output : "+(a/b));
		}
		catch (Exception e)
		{
			System.out.println("Output : Infinity");
		}
		finally
		{
			System.out.println("Thank you for using this software.");
		}
	}
}

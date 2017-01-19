/**
 * WAP to display the sum of two numbers or sum of three numbers or sum of four numbers as per user's choice. 
 * (Use method overloading to define the methods). 
 */
import java.io.*;
public class OverloadingWithObject 
{
	int sum(int a, int b)
	{
		return a+b;
	}
	int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	int sum(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}
	
	public static void main(String args[]) throws IOException
	{
		int a=5, b=6, c=7, d=8;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int choice = Integer.parseInt(in.readLine());
		OverloadingWithObject obj = new OverloadingWithObject();
		
		switch(choice)
		{
			case 2 :	System.out.println(obj.sum(a,b));
						break;
			case 3 : 	System.out.println(obj.sum(a,b,c));
						break;
			case 4 : 	System.out.println(obj.sum(a,b,c,d));
						break;
			default:	System.out.println("Enter a valid choice between 2-4!");
		}
	}
}

import java.util.Scanner;
public class scannerDemo 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number :");
		int m = in.nextInt();
		System.out.println("The number is "+m);
		if(in.hasNextInt())
		{
			int n = in.nextInt();
			System.out.println("The number is "+n);
		}
	}
}

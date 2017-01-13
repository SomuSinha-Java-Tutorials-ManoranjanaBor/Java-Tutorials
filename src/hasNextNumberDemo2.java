import java.util.Scanner;
public class hasNextNumberDemo2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Data :");
		if(in.hasNextInt())
			System.out.println("You have entered an Integer");
		else 
			System.out.println("Token not an Integer");
	}
}

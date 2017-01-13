import java.util.Scanner;
public class hasNextNumberDemo
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Data :");
		if(in.hasNextInt())
			System.out.println("You have entered an Integer as : "+in.nextInt());
		else if(in.hasNextFloat())
			System.out.println("You have entered an Float Value as : "+in.nextFloat());
		else if(in.hasNextDouble())
			System.out.println("You have entered an Double Value as : "+in.nextDouble());
		else 
			System.out.println("Token not an Integer or a real value.");
	}
}

import java.util.Scanner;
public class hasNextLineDemo
{
	public static void main(String args[])
	{
		String s = "Abc \n Def";
		Scanner in = new Scanner(s);

		System.out.println("First Line : "+in.next());
		if(in.hasNextLine())
		{
			System.out.println("The Next Line : "+in.nextLine());
		}
		else
			System.out.println("No other token!");
	}
}

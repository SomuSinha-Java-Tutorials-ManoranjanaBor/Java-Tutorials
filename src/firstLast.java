import java.util.Scanner;
public class firstLast 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter F or L : ");
		char c = (in.next()).charAt(0);
		switch(c)
		{
			case 'f' :
			case 'F' :	System.out.println("First");
						break;
						
			case 'l' :			
			case 'L' :	System.out.println("Last");
						break;
						
			default  :	System.out.println("Invalid Choice");
		}
	}
}

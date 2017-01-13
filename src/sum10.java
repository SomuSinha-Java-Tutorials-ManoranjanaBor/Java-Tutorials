import java.util.Scanner;
public class sum10 
{
	public static void main(String args[])
	{
		int i, s=0;
		int m[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 Nums: ");
		for(i=0;i<10;i++)
			m[i] = in.nextInt();
		for(i=0;i<10;i++)
			s += m[i];
		System.out.println("Sum = "+s);
	}
}

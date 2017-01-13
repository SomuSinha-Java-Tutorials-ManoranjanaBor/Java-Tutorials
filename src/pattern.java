
public class pattern 
{
	public static void main(String args[])
	{
		String str = "BLUEJ";
		for(int i=str.length();i>=1;i--)
		{
			System.out.print(str.substring(0, i));
			for(int j=1;j<=(5-i);j++)
				System.out.print(j);
			
			System.out.println();
		}
	}
}

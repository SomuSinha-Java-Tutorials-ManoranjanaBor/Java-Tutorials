public class substr 
{
	public static void main(String args[])
	{	
		String text="BLUEJ";
		int i=0;
		for(i=0;i<text.length();i++)
		{
			System.out.print(text.substring(i, 5));
			System.out.println(text.substring(0, i));
		}
	}
	
}

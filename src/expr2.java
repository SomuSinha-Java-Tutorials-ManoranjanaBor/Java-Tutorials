public class expr2 
{
	public static void main(String args[])
	{
		int x=5,y=3;
		x+=y*++x-x/y-y++;
		System.out.println("Value = "+x);
	}
}

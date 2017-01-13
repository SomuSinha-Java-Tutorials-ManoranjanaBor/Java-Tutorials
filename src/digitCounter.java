public class digitCounter 
{
	static int digiCount_1(int x)
	{
		int count=0;
		while(x>0)
		{
			x=x/10;
			count++;
		}
		return count;
	}
	
	static int digiCount_2(int x)
	{
		String str = Integer.toString(x);
		return str.length();
	}
	
	public static void main(String args[])
	{
		int x = 23452;
		System.out.println(digiCount_1(x));
		System.out.println(digiCount_2(x));
	}
}

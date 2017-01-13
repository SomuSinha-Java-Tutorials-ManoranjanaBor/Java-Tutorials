class num
{
	int a,b;
	num(int x, int y)
	{
		a=x;
		b=y;
	}
}

public class test 
{
	static int add(num obj)
	{
		return(obj.a+obj.b);
	}
	
	public static void main(String args[])
	{
		num obj = new num(2,4);
		int sum = add(obj);
		System.out.println("The sum of "+obj.a+" and "+obj.b+" is = "+sum);
	}	
}

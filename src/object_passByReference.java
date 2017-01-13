class num2
{
	int a,b;
	num2(int x, int y)
	{
		a=x;
		b=y;
	}
}
public class object_passByReference 
{
	static void change(num2 obj)
	{
		int temp;
		
		temp=obj.a;
		obj.a=obj.b;
		obj.b=temp;
	}
	
	public static void main(String args[])
	{
		num2 obj = new num2(2,4);
		System.out.println("BEFORE CALL BY REFERENCE : The Value of a is "+obj.a+" and value of b is "+obj.b);
		change(obj);
		System.out.println("AFTER  CALL BY REFERENCE : The Value of a is "+obj.a+" and value of b is "+obj.b);
	}	
}


public class overloading 
{
	static int area(int side)
	{
		return side*side;
	}
	
	static double area(double rad)
	{
		return (22/7d*rad*rad);
	}
	
	static int area(int x, int y)
	{
		return x*y;
	}
	
	public static void main(String args[])
	{
		int a=5;
		System.out.println("Area of a square = "+area(a));
		
		double r = 5.31;
		System.out.println("Area of a circle = "+area(r));
		
		int b = 6;
		System.out.println("Area of a rectangle = "+area(a,b));
	}	
}

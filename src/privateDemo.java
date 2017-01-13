class apple 
{
	private int a;
	void set(int x)
	{
		a = x;
	}
	void display()
	{
		System.out.println(this.a);
	}
}
public class privateDemo 
{
	public static void main(String args[])
	{
		apple obj = new apple();
		obj.set(5);
		obj.display();
	}
}


public class Pattern2 
{
	public static void pattern(int i)
	{
		int sp,j,k;
		for(sp=4-i;sp>0;sp--)
			System.out.print(" ");
		for(j=1;j<=i;j++)
			System.out.print(j);
		for(k=i-1;k>0;k--)
			System.out.print(k);
		System.out.println();
	}
	
	public static void main(String args[])
	{
		int i=0;
		for(i=1;i<=4;i++)
			pattern(i);
		for(i=3;i>=1;i--)
			pattern(i);
	}
}

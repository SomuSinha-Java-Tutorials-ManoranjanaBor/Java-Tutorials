
public class series 
{
	public static void main(String args[])
	{
		int terms=3;
		double r=0.0, sum=0.0;
		for(int i=1, t=1;t<=terms;i+=2,t++)
		{
			int p=1, f=1;
			for(int j=1;j<=i;j++)
				f*=j;
			
			for(int k=1;k<=i;k+=2)
				p= p*k;
			
			r=(Math.pow(p,t)/f);
			sum+=r;
		}
		System.out.println("The Sum is : "+sum);
	}
}

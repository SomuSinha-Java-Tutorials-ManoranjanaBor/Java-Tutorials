import java.io.*;
public class pascalsTriangle 
{
	static int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		return f;
	}
	
	static int comb(int n, int r)
	{
		return(fact(n)/(fact(n-r)*fact(r)));
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of levels: ");
		int level = Integer.parseInt(in.readLine());
		for(int i=0;i<=level;i++)
		{
			for(int k=level-i;k>0;k--)
				System.out.print(" ");
			
			for(int j=0;j<=i;j++)
			{
				int val = comb(i,j);
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}

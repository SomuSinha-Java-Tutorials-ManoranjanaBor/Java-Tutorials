public class starPattern 
{
	public static void main(String args[])
	{
		int i,j,k;
		i=j=k=0;
		int limit;
		
		for(;i<5;i++)
		{
			if(i<=1)
				limit=1;
			else if (i==2)
				limit=2;
			else
				limit=3;
		
			k=i;
			for(j=1;j<=limit;j++)
			{
				if(i==0 && k==0)
					System.out.print("*");
				else if(i==3 && k==1)
					System.out.print(" "+k);
				else if(k!=0)
					System.out.print("*"+k);
					
				k--;
			}System.out.println();
		}
	}
}

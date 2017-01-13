import java.util.Scanner;
public class wordRev2 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String str = new String();
		char ow[]=new char[20];
		char nw[]=new char[20];
		
		int len=0,f,l,i,j;
		
		System.out.print("Enter your string :");
		str=in.nextLine();
		len=str.length();
		
		f=l=len-1;
		j=0;
		
		/*Copy String into an Array*/
		for(i=0; i<len;i++)
			ow[i] = str.charAt(i);
		
		while(f>=0)
		{
			for(i=l;i>=0;i--)
			{
				if(ow[i]==' ')
					break;
				else
				{
					f=i;
				}
			}
			
			for(i=f;i<=l;i++)
				nw[j++]=ow[i];
			
			nw[j++]=' ';
			f=l=(f-2);
		}
		
		for(i=0; i<len;i++)
			System.out.print(nw[i]);
	}
}
import java.util.*;
public class wordRev 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i,j=0,p;
		String str, t="";
		String nw[]= new String[10];
		System.out.print("Enter your string :");
		str=in.nextLine();
		p=str.length();
		
		for(i=0; i<p;i++)
		{
			char k = str.charAt(i);
			if(k!=' ')
				t=t+k;
			else
			{
				nw[j]=t;
				j=j+1;
				t=" ";
			}
		}
		
		nw[j]=t;
		System.out.println("Reversed String : ");
		for(i=j;i>=0;i--)
		{
			System.out.print(nw[i]+" ");
		}
	}
}

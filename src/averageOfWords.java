/**
 * Find the average length of words after inputting a statement.
 */
import java.util.*;
public class averageOfWords 
{
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		int si, sp;
		String st, st1;
		int p, sum;
		System.out.print("Enter the sentence : ");
		st = in.nextLine();
		sum=si=0;
		double avg = 0.0;
		p=st.length();
		int nw=0;
		
		sp=-1;
		while(sp!=p)
		{
			si=sp+1;
			sp=st.indexOf(' ', si);
			if(sp==-1)
				sp=st.length();
			st1=st.substring(si,sp);
			sum+=st1.length();
			if(st1.length()>0)	//	Only increase the number of words if the substring is not empty, i.e., there are no consecutive spaces. 
				nw++;
		}
		
		avg=sum/(nw*1.0);
		System.out.println("Average lenght : "+avg);
	}
}

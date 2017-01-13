import java.io.*;
public class numberInWords 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number between 0-999 : ");
		int input = Integer.parseInt(in.readLine());
		
		String ones_place[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String tens_place[]={"", "Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String ten_series[]={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		
		String output="";
		int no_of_digits=0;
		int copy=input;
		
		while(copy>0)
		{
			no_of_digits++;
			copy/=10;
		}
		
		int fD=0;
		int sD=0;
		
		copy=input;
		int rev = 0;
		while(copy>0)
		{
			rev=rev*10+(copy%10);
			copy/=10;
		}
		
		if(no_of_digits==1)
		{
			fD=rev;
			output+=ones_place[fD-1];
		}
		else if(no_of_digits==2)
		{
			fD=rev%10;
			sD=rev/10;
			
			if((fD==1)&&(sD!=0))
			{
				output+=ten_series[sD-1];
			}
			else
			{
				output+=tens_place[fD]+" ";
				if(sD!=0)
					output+=ones_place[sD-1];
			}
		}
		else if(no_of_digits==3)
		{
			output+=ones_place[rev%10-1]+" Hundred ";
			rev/=10;
			fD=rev%10;
			sD=rev/10;
			
			if((fD==1)&&(sD!=0))
			{
				output+=ten_series[sD-1];
			}
			else
			{
				output+=tens_place[fD];
				output+=(fD==0?"":" ");
				if(sD!=0)
					output+=ones_place[sD-1];
			}
		}
		else
		{
			if(input==0)
				output="Zero";
			else
				output="Wrong Format of Input!!";
		}
		
		System.out.println(output);
	}
}

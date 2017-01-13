import java.io.*;
public class stringop 
{
	String str;
	String str1;
	
	stringop()
	{
		str=null;
		str1="";
	}	
	void accept()throws IOException
	{
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter the string which is to be encoded : ");
		str=in.readLine();
	}
	void encode()
	{
		int n;
		char ch,x;
		int p=str.length();
		
			for(int j=0;j<p;j++)
			{
				ch=str.charAt(j);
				n=(int)ch;
				x=(char)(n+2);
				str1=str1+x;
			}
	}
	
    void print()
    {
    	int n;
    	char x;char ch;
    	int p=str1.length();
    	for(int j=0;j<p;j++)
    	{
    		ch=str1.charAt(j);
    		n=(int)ch;
    		if((n-2)==((int)' '))
    		{
    			System.out.print("\n");
    		}
    		else
    		{
    			System.out.print(ch);
    		}
    	}
    }
    
    public static void main(String args[])throws IOException
    {
    	stringop obj = new stringop();
    	obj.accept();
    	obj.encode();
    	obj.print();
    }
}
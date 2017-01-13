import java.io.*;
public class taxCalculate 
{
     String name,address,subject;
     long phno;double sal,tax=0;
      
     void accept()throws IOException
     {
    	 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    	 System.out.print("Enter the name : ");
    	 name=in.readLine();
    	 System.out.print("Enter the address : ");
    	 address=in.readLine();
    	 System.out.print("Enter the phone number : ");
    	 phno=Long.parseLong(in.readLine());
    	 System.out.print("Enter the subject spcialization : ");
    	 subject=in.readLine();
    	 System.out.print("Enter the monthly salary : ");
    	 sal=Double.parseDouble(in.readLine());	 
     }
     
     void calculate()
     {
    	 if ((12*sal)>175000)
    	 	tax=((sal*12)-175000)*5d/100d;
    	 else
    		 tax = 0;
     }
     
     void display()
     {
    	 System.out.println("Name : "+name);
    	 System.out.println("Address : "+address);
    	 System.out.println("Subject : "+subject );
    	 System.out.println("Phone No. : "+phno);
    	 System.out.println("Monthly Salary :"+sal);
    	 System.out.println("Income Tax : "+tax);
     }
     
     public static void main(String args[])throws IOException
     {
    	 taxCalculate ob = new taxCalculate();
    	 ob.accept();
    	 ob.calculate();
    	 ob.display();
     }
}

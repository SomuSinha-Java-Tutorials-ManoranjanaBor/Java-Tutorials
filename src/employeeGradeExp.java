import java.io.*;
class employee
{
	String name;
	int g,e;
	double sal;
	
	employee(String name,int g,int e)
	{
		this.name = name;
		this.g = g;
		this.e = e;
	}
	
	void calc()
	{
		sal = (1200*(5-g)+(250*e)+200);
	}
	
	void display()
	{
		System.out.println("Name : "+name+"\tGrade : "+g+"\tExperience : "+e+"\t Salary : "+sal);
	}
}

public class employeeGradeExp 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		employee set[] = new employee[10];
		String name;
		int g,e;
		
		for(int i=0; i<set.length; i++)
		{
			System.out.print("Enter Name : ");
			name = in.readLine();
			System.out.print("Enter Grade : ");
			g = Integer.parseInt(in.readLine());
			System.out.print("Enter Experience : ");
			e = Integer.parseInt(in.readLine());
			set[i] = new employee(name,g,e);
			set[i].calc();
		}
		
		for(int i=0; i<set.length; i++)
		{
			set[i].display();
		}
	}
}

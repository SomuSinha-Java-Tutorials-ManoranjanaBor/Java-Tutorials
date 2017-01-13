class abc
{
    private int a,b;
    abc(int x, int y)
    {
        a = x;
        b = y;
    }
    
    private void display()
    {
        System.out.println("The values are : "+a+" and "+b);
    }
    
    void display2()
    {
    	display();
    }
}

class demo
{
    public static void main(String args[])
    {
        abc obj = new abc(2,3);
        obj.display2();
    }
}
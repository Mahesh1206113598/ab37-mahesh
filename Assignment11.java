package assignments;

public class Assignment11 {
	static void mahesh(int a)
	{
	System.out.println(999);	
	}
	static void mahesh(double a)
	{
	System.out.println(12.45);	
	}
	static void mahesh(char a)
	{
	System.out.println("l");	
	}
	void mahesh(boolean a) 
	{
	System.out.println(false);	
	}
	void mahesh(String a)
	{
		System.out.println("hi this is mahesh");	
	}
	public static void main(String[] args) {
		mahesh(2);
		mahesh(2.22);
		mahesh('m');
		Assignment11 bn=new Assignment11();
		bn.mahesh(true);
	 	bn.mahesh("hello");

	}

}

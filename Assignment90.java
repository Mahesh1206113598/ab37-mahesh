
//Upcasting and downcasting Problem2 as per diagram during class
package assignments;
class sunraise
{
	void sun()
	{
		System.out.println("sun");	
	}
}
class moonview extends sunraise
{
	void moon()
	{
		System.out.println("moon");	
	}
}

public class Assignment90 extends sunraise{
	void earthquack()
	{
		System.out.println("earth");
	}

	public static void main(String[] args) 
	{
		sunraise s1=   new Assignment90();
		s1.sun();
		

	}

}

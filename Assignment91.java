
//Upcasting and downcasting Problem3 as per diagram during class
package assignments;
class onebhk{
	void one()
	{
		System.out.println("one");
	}
}
class twobhk extends onebhk{
	void two()
	{
		System.out.println("two");
	}
}
public class Assignment91 extends twobhk{
	void three()
	{
		System.out.println("three");
	}

	public static void main(String[] args) {
       
		twobhk tb2= new Assignment91();
		tb2.two();
		tb2.one();

	}

}

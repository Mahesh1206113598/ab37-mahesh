//Upcasting and downcasting Problem4 as per diagram during class
package assignments;
class stateone{
	void state1()
	{
		System.out.println("state1");
	}
}
class statetwo extends stateone{
	void state2()
	{
		System.out.println("statetwo");
	}
}
class statethree extends statetwo{
	void state3()
	{
		System.out.println("statethree");
	}
}
public class Assignment92 extends statethree
{
	void statefour()
	{
		System.out.println("state4");
	}

	public static void main(String[] args) {
		
		statetwo s2= new statethree();
		s2.state2();
		s2.state1();
	
	}

}

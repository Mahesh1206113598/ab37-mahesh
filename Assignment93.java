//Upcasting and downcasting Problem5 as per diagram during class
package assignments;
class worldone{
	void world1()
	{
 		System.out.println("worldone");
	}
}
class worldtwo extends worldone{
	void world2()
	{
		System.out.println("worldtwo");
	}
}
class worldthree extends worldtwo{
	void world3()
	{
  		System.out.println("worldthree");
	}
}
public class Assignment93 extends worldthree{
	void world4()
	{
  		System.out.println("worldfour");
	}
	public static void main(String[] args) {
		worldtwo w=new worldthree();
		w.world2();
		w.world1();
		Assignment93 w1= (Assignment93) w;
		w.world1();
		w.world2();
		

	}

}

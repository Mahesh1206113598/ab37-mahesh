package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61 {

	public static void main(String[] args) {
		try { 
		int c=1/0;
		Scanner s1=new Scanner(System.in);
		int mahesh= s1.nextInt();		
		}
		catch(ArithmeticException a1)
		{
			System.out.println("manual");
		}
		catch(NullPointerException a2)
		{
			System.out.println("dev"); 
		}
		catch(InputMismatchException b1)
		{
			System.out.println("tester");
		}
		

	}

}

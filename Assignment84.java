//check if 2 given strings are anagram of each other
package assignments;

import java.util.Arrays;

public class Assignment84 {

	public static void main(String[] args) {
		String s1="egg";
		String s2="geg";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not an anagram");
		}
		else
		{
		char []c1=	s1.toCharArray();
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
		 char []c2=   s2.toCharArray();
		 Arrays.sort(c2);
		System.out.println(Arrays.toString(c2));
		System.out.println(" anagram");
		}
				

	}

}

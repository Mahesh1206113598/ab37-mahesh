//Reverse a string and print it
package assignments;

public class Assignment82 {

	public static void main(String[] args) {
		String input="mahesh";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
		char reverse=	 input.charAt(i);
		output=output+reverse;
		//System.out.println(output);
		}
System.out.println(output);
	}

}

//check if the given string is pallindrome
package assignments;

public class Assignment83 {

	public static void main(String[] args) {
		String input="malayalam";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
		char reverse=	 input.charAt(i);
		output=output+reverse;
		//System.out.println(output);
		}
         System.out.println(output);
         if(input.equals(output))
         {
        	 System.out.println("the given string is a pallindrome");
         }
         else
         {
        	 System.out.println("the given string is not pallindrome");
         }
	}

}

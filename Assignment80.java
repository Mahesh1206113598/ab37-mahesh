package assignments;

public class Assignment80 {

	public static void main(String[] args) {
		String name="Mahesh123";
		char c1[]=  name.toCharArray();
		 for(int i=0;i<name.length();i++)
		{
			boolean answer=  Character.isDigit(c1[i]);
			if(answer==true)
			{
				 System.out.println(i);
			}
			
		}

	}

}

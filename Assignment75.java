package assignments;

public class Assignment75 {

	public static void main(String[] args) {
		int listofnombers[]= {10,11,12,41};
		int requirednom=41;
		for(int i=0;i<=3;i++) {
		if(requirednom==listofnombers[i])
		{
			System.out.println("nom is present"+listofnombers[i]);
		}
		else
		{
			System.out.println("not present"+listofnombers[i]);
		}
		}
		

	}

}

package assignments;

public class Assignment66 {

	public static void main(String[] args) {
		int rollno[]=new int[4];
		rollno[0]=5;
		rollno[1]=10;
		rollno[2]=15;
		rollno[3]=20;
		int sum=0;
		for(int i=0;i<rollno.length;i++)
		{
			sum=sum+rollno[i];
		}
		System.out.println(sum);
		double average=sum/rollno.length;
		System.out.println(average);
		double reminder=sum%rollno.length;
		System.out.println(reminder);
				
		
		

	}

}

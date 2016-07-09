package HeadFirstJavaPac;
import java.util.Scanner;
public class SchoolProgress {

	public static void main(String[] args) {
	
		float m;
		float e;
		float h;
		float s;
		float ss;
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your Maths score out of 100:");
		m=in.nextFloat();
		System.out.println("Please enter your English score out of 100:");
		e=in.nextFloat();
		System.out.println("Please enter your Hindi score out of 100:");
		h=in.nextFloat();
		System.out.println("Please enter your Science score out of 100:");
		s=in.nextFloat();
		System.out.println("Please enter your Social Studies score out of 100:");
		ss=in.nextFloat();		
		
		
		float sum=0;
		float avg=0;
		sum=m+e+h+s+ss;
		avg=sum/5;
		
		if(avg>90)
			System.out.println("Excellent Performace");
		if(avg>80 && avg<89)
			System.out.println("Very Good Performace");
		if(avg>70 && avg<79)
			System.out.println("Good Performace");
		if(avg>60 && avg<69)
			System.out.println("Average Performace");
		if(avg<59)
			System.out.println("Poor Performace");
		
		
		
		
		
	}

}

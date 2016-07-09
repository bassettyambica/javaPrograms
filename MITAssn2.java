package HeadFirstJavaPac;
import java.util.Scanner;
public class MITAssn2 {

	public static void main(String[] args) {
		float h1;
		float h2;
		float b;
		float sal1;
		float sal2;
		float x= (float) 1.5;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter hours worked by an employye:");
		h1=in.nextFloat();
		if(h1>73)
		System.out.println("No of hours can't be > 73");	
		System.out.println("Enter base pay:");
		b=in.nextFloat();
		
		if(b<8 || h1>73)
		{
			System.out.println("Base pay cannot be less than 8 ");
		}
    if(h1<=40 && b>=8)
    {
		sal1=h1*b;
		System.out.println("Salary of an employee is:"+ sal1);
    }
    else if(h1>40 && b>=8)
	{
    	sal1=h1*b;
		h2=h1-40;
		sal2=h2*b*x;
		System.out.println("Salary of an employee is:"+ (sal1+sal2));
	}
		
		
		
		
		

	}

}

package HeadFirstJavaPac;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		double n;
		double m;
		System.out.println("Enter the number of discs:");
		Scanner in=new Scanner(System.in);
		n=in.nextDouble();
		System.out.println("Enter the m value:");
		m=in.nextDouble();
		if(m>Math.pow(2,n))
		{
			System.out.println("Please enter a valid move number");
		}
		
		double x=n-1;
		double y=Math.pow(2,x)-1;
		if(m==Math.pow(2, x))
		{
			System.out.println("Peg 1 to Peg 2");
		}
		if(m<=y)
		{
			System.out.println("Peg 1 to Peg 3");
		}
		if(m>Math.pow(2,x)&&m<=Math.pow(2,n))
		{
			System.out.println("Peg 3 to Peg 1");
		}
		switch (m) {
		case 1:
			System.out.println("Peg 1 to Peg 2");
			
			break;
		case 2:
			System.out.println("Peg 1 to Peg 3");
			
			break;
		case 3:
			System.out.println("Peg 2 to Peg 1");
			
			break;
		case 4:
			System.out.println("Peg 2 to Peg 3");
			
			break;
		case 5:
			System.out.println("Peg 3 to Peg 1");
			break;
		case 6:
			System.out.println("Peg 3 to Peg 2");
			
			break;
		
		
	}

}

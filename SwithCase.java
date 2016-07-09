package HeadFirstJavaPac;
import java.util.Scanner;


public class SwithCase {

	public static void main(String[] args) {
		int t;
		System.out.println("Please enter the t value between 1-5:");
		Scanner in=new Scanner(System.in);
		 t=in.nextInt();
			
		
			switch (t) {
			case 1:
				System.out.println("The swith is in 1st case");
				
				break;
			case 2:
				System.out.println("The swith is in 2nd case");
				
				break;
			case 3:
				System.out.println("The swith is in 3rd case");
				
				break;
			case 4:
				System.out.println("The swith is in 4rd case");
				
				break;
			case 5:
				System.out.println("The swith is in 5th case");
				
				break;
			
			default:
				System.out.println("The value you entereted doesn't fall into any case");
				break;
			}

	}

}

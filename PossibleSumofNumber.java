package CareerCup;
import java.util.Scanner;

public class PossibleSumofNumber {

	public static void main(String[] args) {
	
		int n;
		System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(n==i+(i+1))
			{
				
				System.out.println(i + (i+1));
			}
		}
		
	}

}

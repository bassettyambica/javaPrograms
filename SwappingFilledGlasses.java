package HeadFirstJavaPac;
import java.util.Scanner;

public class SwappingFilledGlasses {

	public static void main(String[] args) {
		int n,c=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of filled glasses");
		n=in.nextInt();
		for(int x=2,y=((2*n)-1);x<=n&y>=(n+1);)
		{
			
				c=x;
				x=y;
				y=c;
				x+=2;
				y-=2;
				System.out.println(""+x+" "+y);
			}
		
		

	}

}

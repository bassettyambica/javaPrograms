package HeadFirstJavaPac;
import java.util.Scanner;

public class MyTowersOfHanoi {
	public void solve(int d,String peg1,String peg2,String peg3)
	{
		if(d>1)
		{
			solve(d-1,peg1,peg2,peg3);
			System.out.println(peg1+"to"+peg2);
			solve(d-1,peg3,peg1,peg2);
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		MyTowersOfHanoi my=new MyTowersOfHanoi();
		System.out.println("Enter the value of n");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		my.solve(n,peg1,peg2,peg3);

	}

}

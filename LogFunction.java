package HeadFirstJavaPac;
import java.lang.Math;
import java.util.Scanner;

public class LogFunction {

	public static void main(String[] args) {
		
		float n;
		float m;
		
	//	System.out.println("enter n");
		
		
		
		double a;
		double b;
	
			//System.out.println("Ta=   "   +a);
		//	System.out.println("Tb=   "   +b);
//		if(a==100&&b==100)
//		Scanner in=new Scanner(System.in);
//		n=in.nextDouble();
//		System.out.println(n);
		
		for(n=0;n<=1000;n++)
		
		{
		//	System.out.println(n);
			a=(double) (1000*n*(Math.log10(n)));
//		System.out.println("**"+(Math.log(n)));		    
			b=(double) 10*n*n;
			if(a<=b)
		    {
		System.out.println(a +" is value of 'a' &     " + b +" is value of 'b'");
			System.out.println((float) n +"    n value");
		    }
				
		}
	
	}

}

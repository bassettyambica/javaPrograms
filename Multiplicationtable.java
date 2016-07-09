package HeadFirstJavaPac;
import java.util.Scanner;
public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x;
     
       System.out.println("please enter x value:");
       Scanner m=new Scanner(System.in);
       x=m.nextInt();
		for(int i=0;i<=10;i++)
		{
			
			System.out.println(x+"*"+i+"="+(x*i));
			
		}
	}

}

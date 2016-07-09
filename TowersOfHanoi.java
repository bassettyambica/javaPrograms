package HeadFirstJavaPac;

import java.util.Scanner;

public class TowersOfHanoi {

	   public void solve(int n, String start, String auxiliary, String end) {
		   {
		   int count=0;
	  //  for(count=0;count<(2^n);count++)   
	  //  {
	       if (n >= 1)  {
	           solve(n - 1, start, end, auxiliary);
	           count++;
	       //    System.out.println(start + " -> " + end);
	           solve(n - 1, auxiliary, start, end);
	           count++;
	          
	       }
	   // }
	      	   }
		   if(n)
		   {
			   System.out.println(start+"->"+end);
		   }
	//   System.out.println(count);
	   }
	 
	   public static void main(String[] args) {
	       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	      
	   }
	}



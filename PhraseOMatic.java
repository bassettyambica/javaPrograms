import java.util.Scanner;

public class PhraseOMatic {
//	static int stat=10;
	

	public static void main(String[] args)
	{
//		File2 ob=new File2();
//		ob.fun();
//		System.out.println(stat);
//		String[] wordListOne= {"24/7","B-to-B","win-win"};
//		String[] wordListTwo={"Value-added","Centric","aligned"};
//		String[] wordListThree={"process","solution","mission"};
//		
//		int oneLength=wordListOne.length;
//		int twoLength=wordListTwo.length;
//		int threeLength=wordListThree.length;
//		
//		int rand1=(int)(Math.random()*oneLength);
//		int rand2=(int)(Math.random()*twoLength);
//		int rand3=(int)(Math.random()*threeLength);
//		
//		String phrase= wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
//		
//		System.out.println("What I need is:"+ phrase);
//		int c=1;
//		switch (c) {
//		case 1:
//			System.out.println("Case 1");
//			
//		//	break;
//		case 2:
//			System.out.println("Case 2");
//			
//			break;
//		default:
//			System.out.println("Default");
//		//	break;
//		}
//		int s=3;
//		if(++s==4)
//			System.out.println(s);
//		else
//			System.out.println("No answer");
//			
//		
//	Assign1
//		int a=10;
//		int b=9;
//		if(a>b)
//			System.out.println("a value is greater=" + a);
//		else
//			System.out.println("b value is greater=" + b);
		
		//Assign 2
		int t;
		
	Scanner in=new Scanner(System.in);
	 t=in.nextInt();
		System.out.println("Please enter the m value between 1-5");
	
		switch (t) {
		case 1:
			System.out.println("The swith is in 1st case");
			
			break;
		case 2:
			System.out.println("The swith is in 2nd case");
			
			break;
		case 3:
			System.out.println("The swith is in 3st case");
			
			break;
		case 4:
			System.out.println("The swith is in 3rd case");
			
			break;
		case 5:
			System.out.println("The swith is in 4rth case");
			
			break;
		
		default:
			System.out.println("The value you entereted doesn't fall into any case");
			break;
		}

	}
}

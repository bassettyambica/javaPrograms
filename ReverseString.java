package CareerCup;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String name;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your String to be reversed");
		name=in.nextLine();
	//	System.out.println(name);
		int len=name.length();
		char[] c=new char[len];
		for(int i=len-1,j=0;i>=0;i--,j++)
		{
			c[j]=name.charAt(i);
					
			
		}
		System.out.println(c);
		
		
		}

}

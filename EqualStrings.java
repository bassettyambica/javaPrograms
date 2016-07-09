package HeadFirstJavaPac;

import java.util.Scanner;

public class EqualStrings {

	public static void main(String[] args) {
		String str1;
		String str2;
		int x=1;
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Enter string 1:");
		str1=in.next();
		System.out.println("enter string 2:");
		str2=in.next();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Not Equal Strings");
		}
		
			for(int i=0;i<=str1.length();i++)
			{
				if(str1.charAt(i)==str2.charAt(i))
				{
				continue;
				}
				else
				{
				x=0;
				}
			}
				
			if(x==0)
			{
			System.out.println("Strings are not equal,but same length");
			}
			else
			{
				System.out.println("They are equal :-)");
			}
		
		
	}
}

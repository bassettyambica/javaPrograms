package CareerCup;
import java.util.Scanner;


public class Quicksort {

	public static void main(String[] args) {
		int n,c,i=0,k=0;
		System.out.println("Please enter n value");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter n elements");
		
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
						
		}
		System.out.println("Quick sort used");

		for(k=0;k<n;k++)
		{
			for(int m=0;m<n;m++)
			{
				if(a[k]<a[m])
				{
				 c=a[k];
				 a[k]=a[m];
				 a[m]=c;
				}
				
			}
		}
		for(k=0;k<n;k++)
		{
		System.out.println("Sorted element :" + a[k] );
	}}
		

}

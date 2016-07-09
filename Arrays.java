package HeadFirstJavaPac;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		int a[]={6,2,3,4,5};
		int i=0;
	//	Scanner i=new Scanner(System.in);
		for(;i<a.length;i++)
		{
			a[i]=i+1;
			
		}
		for(int k:a)
			System.out.println(k);
		
		//for(int k=0;k<5;k++)
		//{
     //  System.out.println(a[k]);
       
//	}
	}

}

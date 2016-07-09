package CareerCup;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int n,i;
	//	System.out.println("Please enter n value");
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Enter n");
		n=in.nextInt();
		
		System.out.println("Enter array elements");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();						
		}
		int difference[]=new int[a.length-1];
	    int missingTerm;

	    for(int im=1;im<a.length;im++){
	        difference[im-1] = a[im]-a[im-1];  
	    }




	    for(int j =0;j<a.length-1;j++)
	    {

	        if(difference[j]!=difference[j+1])
	        {
	            missingTerm = a[j]+difference[j+1];
	            
	    
	        System.out.println("The missing term is: " + missingTerm );
	    }
	    }
	   
	        
	    
	}}

	        
	        
//		System.out.println("Missing number in AP is");
//		for(int j=0;j<=n;j++)
//		{
//			int c=a[j+1]-a[j];
//			int d=a[j+2]-a[j+1];
//			if(c!=d)
//			{
//				a[j+2]=in.nextInt(a[j+2]+d);
//			}
//			System.out.println(a[j+2]+d);
//			
			
		
//		for(int k=0,m=9;k<4&&m>5;k++,m--)
//		{
//			int c=a[k];
//			a[k]=a[m];
//			a[m]=c;
//		}

		

		

	



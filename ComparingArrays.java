package HeadFirstJavaPac;
import java.util.Scanner;

public class ComparingArrays {

	public static void main(String[] args) {
		
		
   int A[], B[],C[];
   int n,m,a=0,x;
   
   System.out.println("Enter the size of array A");
   Scanner in=new Scanner(System.in);
   n=in.nextInt();
   System.out.println("enter the size of array B");
   m=in.nextInt();

      if(n>=m)
   {
	    x=m;
   }
   else 
   {
	  x=n;
   }
      A=new int[n];
      B=new int[m];
      C=new int[x];
   int t=0;
   if(n>1000||m>1000){
	   System.out.println("Enter valid array sizes");
	   	      }
   else 
   {
	   System.out.println("Enter the elements in array A");   
     
     for(int i=0;i<n;i++)
     {
    	A[i]=in.nextInt();
     }
     System.out.println("enter the elements in array B");
     for(int j=0;j<m;j++)
     {
    	 B[j]=in.nextInt();
     }
      }
   
   for(int k=0;k<n;k++)
   {
	   for(int l=0;l<m;l++)
	   {		   
		   if(A[k]==B[l])
		   {
		   C[t]=A[k];
		   
		  // System.out.println("Output elements are:"+Math.min(C[t]));
		   t++;
		   
		   }
//		   else
//		   {
//			   System.out.println("No common values");
//		   }
	   
	   }
   }
 
   
   //System.out.println(C);
   int minValue=C[0];
   for(int p=1;p<t;p++)
   {
	 
	   if(minValue>C[p])
	   {
		   minValue=C[p];
	   }
	   	   
   }
   
   System.out.println("Smaller value is:"+ minValue ); 
     
   }

}

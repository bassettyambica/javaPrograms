package CareerCup;

public class SumDiffarrayElements {

	public static void main(String[] args) {
		
		int a []={3,4,8,1,2};
		int sum=0;
		for(int i=0;i<=a.length();i++)
		{
			if(a[i]+a[i+1]==0||a[i]-a[i+1]==0)
				
		}
		
		
	}
		public boolean check(int[] a) { 
			return DFS(a, 0, 0); 
			System.out.println(sum+a[i] +""+sum-a[i]);
			} 

			public boolean DFS(int[] a, int i, int sum) { 
			if ( i == a.length ) 
			return sum==0; 
			return DFS(a,i+1, sum+a[i]) || DFS(a, i+1, sum-a[i]); 
			}
		

	}


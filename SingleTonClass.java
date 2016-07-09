package HeadFirstJavaPac;

public class SingleTonClass {
	
	private static SingleTonClass singletonObject=null;
	
	protected static SingleTonClass  getinstance()
	{
		if(singletonObject==null)
		{
	    singletonObject=new SingleTonClass();
		System.out.println("Hi");
		}
				
		return singletonObject;
		
		
	}
	
	

}

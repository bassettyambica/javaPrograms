package HeadFirstJavaPac;


public enum colors{red,green,blue;}
public class EnumEg {
	
	

	public static void main(String[] args) {
		
		
		colors ob[]=new colors.values();
		for(colors c:ob)
		{
			System.out.println(c);
		}
	}

}

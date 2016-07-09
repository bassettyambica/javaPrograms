package HeadFirstJavaPac;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
public class Hashmap {

	public static void main(String[] args)
	{
		
		
		HashMap<String,Double> hashmap=new HashMap<String,Double>();
		
		hashmap.put("Ammu",96.3);
		hashmap.put("Nick", 23.5);
		
		Iterator<Entry<String,Double>> iterator=hashmap.entrySet().iterator();
		
		while(iterator.hashNext())
		{
			Map.Entry<String,Double> entry=(Map.Entry) iterator.next();
			System.out.print(entry.getKey()+":");
			System.out.print(entry.getValue());
		}
		
		
	}
	
	
}

package CareerCup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution{
	

public static String compress(String str){
	int count = 1;
	
    StringBuilder builder = new StringBuilder();

    for(int i = 1; i<str.length(); i++){

        if(str.charAt(i) == str.charAt(i-1) && i < str.length()-1){
            count++;
        }
        // case when the last letter is in the sequence preceding it. Add that sequence to
        // the compressed string
        else if(i == str.length()-1 && str.charAt(i) == str.charAt(i-1)){
            count++;
            builder.append(str.charAt(i));
            builder.append(count);
        }

        // case where the last letter is NOT in the sequence preceding it. Add it to string.
        else if(i == str.length()-1 && str.charAt(i) != str.charAt(i-1)){
            builder.append(str.charAt(i-1));
            builder.append(count);
            count = 1;
            builder.append(str.charAt(i));
            builder.append(count);
        }
        else{
            // appending the character and THEN appending the count works.
            builder.append(str.charAt(i-1));
            builder.append(count);
            count = 1;
        }

    }

    str = builder.toString();
    System.out.println(str);
	
	
	return str;
}

	
	public static void main(String[] args) throws IOException{
    	Scanner in =new Scanner(System.in);
//    	final String fileName=System.getenv("OUTPUT_PATH");
//    	BufferedWriter bw=new BufferedWriter(new FileWriter(fileName));
    	String res;
    	String _str = null;
    	res=compress(_str);
//    	bw.write(res);
//    	bw.newLine();
//    	bw.close();
    }

}


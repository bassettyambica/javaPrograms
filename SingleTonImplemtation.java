package HeadFirstJavaPac;

public class SingleTonImplemtation {

	public static void main(String[] args) {
		
		SingleTonClass m=new SingleTonClass();
		m.getinstance();
		SingleTonClass n=new SingleTonClass();
		n.getinstance();
		SingleTonClass x=new SingleTonClass();
		x.getinstance();
	}

}

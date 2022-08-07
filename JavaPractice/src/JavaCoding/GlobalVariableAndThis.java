package JavaCoding;

public class GlobalVariableAndThis {
	
	int a;
	GlobalVariableAndThis(int a)
	{
		this.a=a;
	}

	public static void main(String[] args) {
		GlobalVariableAndThis g=new GlobalVariableAndThis(10);
		System.out.println(g.a);

	}

}

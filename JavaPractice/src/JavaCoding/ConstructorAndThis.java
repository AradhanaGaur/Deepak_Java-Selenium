package JavaCoding;

public class ConstructorAndThis {
	
	ConstructorAndThis()
	{  this(1,2,3,4);
		System.out.println("Default constructor");
	}
	ConstructorAndThis(int a)
	{   this();
		System.out.println("1 parameterized constructor");
	}
	
	ConstructorAndThis(int a, int b)
	{   this(1);
		System.out.println("2 parameterized constructor");
	}
	
	ConstructorAndThis(int a, int b, int c)
	{   this(1,2);
		System.out.println("3 parameterized constructor");
	}
	ConstructorAndThis(int a, int b, int c, int d)
	{   
		System.out.println("4 parameterized constructor");
	}

	public static void main(String[] args) {
		ConstructorAndThis c=new ConstructorAndThis(2,3,4);

	}

}

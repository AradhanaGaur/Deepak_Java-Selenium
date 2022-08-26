package JavaCoding;

public class Parent {
	public Parent()
	{   this("one","two","three");
		System.out.println("Parent default constructor");
	}
	
	public Parent(String one)
	{   this();
		System.out.println("Parent one parameterized constructor");
	}
	
	public Parent(String one, String two)
	{   this("one");
		System.out.println("Parent two parameterized constructor");
	}
	public Parent(String one, String two, String three)
	{   
		System.out.println("Parent three parameterized constructor");
	}
	
}

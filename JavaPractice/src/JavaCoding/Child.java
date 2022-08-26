package JavaCoding;

public class Child extends Parent {
	public Child()
	{   this("one","two");
		System.out.println("Child default constructor");
	}
	public Child(String one)
	{   this();
		System.out.println("Child one parameterized constructor");
	}
	public Child(String one, String two)
	{   super("one","two");
		System.out.println("Child two parameterized constructor");
	}
	public Child(String one, String two, String three)
	{   this("one");
		System.out.println("Child three parameterized constructor");
	}
	
	
	public static void main(String[] args) {
		Parent parent=new Child("one","two","three");

	}

}

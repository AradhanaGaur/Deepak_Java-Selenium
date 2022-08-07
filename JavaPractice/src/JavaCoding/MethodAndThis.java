package JavaCoding;

public class MethodAndThis {
	
	
	void defaultParaMethod()
	{   this.threeParaMethod(1, 2, 3);
		System.out.println("Default method");
	}
	void oneParaMethod(int a)
	{   this.fourParaMethod(1, 2, 3,4);
		System.out.println("One parameterized method");
	}
	void twoParaMethod(int a, int b)
	{   this.oneParaMethod(1);
		System.out.println("Two parameterized method");	
	}
	void threeParaMethod(int a, int b, int c)
	{   
		System.out.println("Three parameterized method");
	}
	void fourParaMethod(int a, int b, int c, int d)
	{  this.defaultParaMethod();
		System.out.println("Four parameterized method");
	}
	

	public static void main(String[] args) {
		MethodAndThis m=new MethodAndThis();
		m.twoParaMethod(1, 2);
		}

}

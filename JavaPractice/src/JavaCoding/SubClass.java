package JavaCoding;

public class SubClass extends SuperClass{
	
	public void childDefault()
	  {   super.parentTwo(1, 2);
		  System.out.println("Child default parameterized method");
	  }
	  public void childOne(int a)
	  {   this.childTwo(1,2);
		  System.out.println("Child one parameterized method");
	  }
	  public void childTwo(int a, int b)
	  {  this.childThree(1, 3, 5);
		  System.out.println("Child two parameterized method");
	  }
	  public void childThree(int a, int b, int c)
	  {   this.childDefault();
		  System.out.println("Child three parameterized method");
	  }

	public static void main(String[] args) {
		
		SubClass s=new SubClass();
        s.childOne(1);
	}

}

package JavaCoding;

public class SuperClass {
  public void parentDefault()
  {   this.parentThree(1,2,3);
	  System.out.println("Parent default parameterized method");
  }
  public void parentOne(int a)
  {  this.parentDefault();
	  System.out.println("Parent one parameterized method");
  }
  public void parentTwo(int a, int b)
  {   this.parentOne(1);
	  System.out.println("Parent two parameterized method");
  }
  public void parentThree(int a, int b, int c)
  {
	  System.out.println("Parent three parameterized method");
  }
}

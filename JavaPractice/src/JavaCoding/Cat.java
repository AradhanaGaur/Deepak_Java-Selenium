package JavaCoding;

public class Cat extends Animal{
	public void run()
	{
		System.out.println("cat runs");
	}

	public static void main(String[] args) {
	Animal a=new Cat();
	a.run();
	String n=a.run("dog");
	int k=a.run("dog","ele");
	System.out.println(k);
	System.out.println(n);

	}

}

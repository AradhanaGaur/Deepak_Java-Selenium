package JavaCoding;

public class Dog extends Animal{
    public void run()
    {
    	System.out.println("Dog is an animal");
    }
	public static void main(String[] args) {
		Dog d=new Dog();
		d.run();

	}

}

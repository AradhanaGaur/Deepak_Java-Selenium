package JavaCoding;



public class Animal {
	
 public void run()
 {
	System.out.println("Animal runs");
 }
 
 public String run(String dog)
 {
	System.out.println(dog+"Animal runs");
	return "Dog runs";
 }
 
 public int run(String dog, String ele)
 {
	System.out.println(dog+"Animal runs fater than "+ele);
	return 2;
 }
}

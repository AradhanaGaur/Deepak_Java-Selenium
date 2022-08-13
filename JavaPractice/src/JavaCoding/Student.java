package JavaCoding;

public class Student {
    String name;
    int id;
   
    public void admissionOpen()
    {
    	System.out.println("Admission open till 31 Aug");
	    System.out.println("Admission open till 23 Aug");
    }
    public void admissionclosed()
    {
    	System.out.println("No more enrollment");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student student=new Student();    
     student.name="Arohi";
     student.id=1001;
     student.admissionOpen();
     System.out.println("Name of Student-->"+student.name);
     System.out.println("Id of Student-->"+student.id);
     student.admissionclosed();
     
	}

}

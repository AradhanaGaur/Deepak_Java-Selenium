package JavaCoding;

public class ArithmeticOperation1_D2 {
	
	  static int a=10;
	  static int b=2;
	 
	 public int sum(int a, int b)
	 {
		 int sumresult=a+b;
		 return sumresult;
	 }
	 
	 public int sub(int a, int b)
	 {
		 int sumresult=a-b;
		 return sumresult;
	 }
	 public int multi(int a, int b)
	 {
		 int sumresult=a*b;
		 return sumresult;
	 }
	 
	 public int div(int a, int b)
	 {
		 int sumresult=a/b;
		 return sumresult;
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("((((10+2)+2)-2)*2)/2)");
     ArithmeticOperation1_D2 d=new ArithmeticOperation1_D2();
     int sum1=0;
     sum1=d.sum(a, b);
     int sum2=d.sum(sum1, b);
     int sub=d.sub(sum2,b);
     int multi=d.multi(sub,b);
     int finalresult=d.div(multi,b);
     System.out.println(finalresult);
     
     
     System.out.println("((((10-2)+2)-2)*2)/2)");
     int newsub=d.sub(a,b);
     int newsum=d.sum(newsub,b);
     int newsub1=d.sub(newsum,b);
     int newmulti=d.multi(newsub1, b);
     int finalresult1=d.div(newmulti, b);
     System.out.println(finalresult1);
     
	}


	

}

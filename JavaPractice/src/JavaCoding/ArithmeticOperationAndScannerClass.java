package JavaCoding;

import java.util.Scanner;

public class ArithmeticOperationAndScannerClass {
	public long add(long i, long j)
	{
		long result=i+j;
		return result;
		
	}
	public long sub(long i, long j)
	{
		long result=i-j;
		return result;
		
	}
	public long multi(long i, long j)
	{
		long result=i*j;
		return result;
		
	}
	public long div(long i, long j)
	{
		long result=i/j;
		return result;
		
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of a1");
	long a1l=sc.nextLong();
	System.out.println("Enter value of a2");
	long a2l=sc.nextLong();
	System.out.println("Enter value of a3");
	long a3=sc.nextLong();
	System.out.println("Enter value of a4");
	long a4=sc.nextLong();
	System.out.println("Enter value of a5");
	long a5=sc.nextLong();
	System.out.println("Enter value of a6");
	long a6=sc.nextLong();
	
	ArithmeticOperationAndScannerClass a=new ArithmeticOperationAndScannerClass();
	long sumresult=a.add(a1,a2);
	long sumresult2=a.add(sumresult,a3);
	long multiresult=a.multi(sumresult2,a4);
	long subresult=a.sub(multiresult,a5);
	long finalresult=a.div(subresult,a6);
	System.out.println("Answer to 1st Assignment is->"+finalresult);
	
	long multiresult1=a.multi(a1,a2);
	long sumresult3=a.add(multiresult1,a3);
	long sumresult4=a.add(sumresult3,a4);
	long subresult1=a.sub(sumresult4,a5);
	long finalresult2=a.div(subresult1,a6);
	System.out.println("Answer to 2st Assignment is->"+finalresult2);
	
	
	
	
	
	}

}

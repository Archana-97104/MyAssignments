package DaytwoAssignment;

public class Fibonacci {
  public static void main(String[] args) {
	int num =8; 
	 int a= 0;
	 int b = 1;
	 int c;
	 for (int i =1; i<=10; i++){
		 c= a+b;
		 System.out.println("the answeer is "+ c);
		 a=b;
		 b=c;
		 
	 }
	  
}
}
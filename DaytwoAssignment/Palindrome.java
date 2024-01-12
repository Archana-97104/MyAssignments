package DaytwoAssignment;

public class Palindrome {
	public static void main(String[] args) {
		int n=1234, rev=0, rem, temp;
		  
        temp = n;
  
        for( ;n != 0; n /= 10 )
        {
            rem = n % 10;
            rev= rev* 10 + rem;
        }
  
       
        if (temp== rev)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }

}



import java.util.Scanner;
import java.lang.Math;
/**
 * 
 * Judge if a number is a prime number
 * @author Simon Lu
 *
 */
public class PT3_7 {

	public static void main(String[] args) {
			
			
			System.out.println("請輸入一個正整數:");
			Scanner in=new Scanner(System.in);
			int numone1=in.nextInt();
			in.close();
			if (numone1<0)//check whether the input is positive
			{System.out.println(numone1+"不是質數");}
			else
			{System.out.println(detectPrime(numone1)? numone1+"是質數":numone1+"不是質數");}
			

	}
	public static boolean detectPrime(int testnum) {
		int sqrnum=(int)Math.sqrt(testnum);
		boolean primenum=true;
		
		
		//first determine whether the number is an even number greater than two
		if (testnum!=2 && testnum%2==0)
		{	primenum=false;
		}
		//skip multiples of two
		for (int i = 3; i < sqrnum; i+=2) {
			if (testnum%i==0)
			{primenum=false;
			break;}
		}
		
		
		return primenum;
	}
				
	
}

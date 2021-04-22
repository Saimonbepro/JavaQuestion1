import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		System.out.println("答案是:");
		int test=100;
		System.out.print(dishalfrun(test));
		System.out.print('秒');
		}
	
	public static int dishalfrun(int n){
		if (n<1)
			return 0;//check if the distance is more than 1 meter
		int t=0;
		while(n>=1){
			n/=2;//run half the distance each time
			t++;
		}
		return t;
	}

}

import java.util.Scanner;

public class PT3_9 {

	public static void main(String[] args) {
		System.out.println("請輸入一個正整數：");
		Scanner in=new Scanner(System.in);
		int numone=in.nextInt();
		in.close();	
		for(int a =1 ; a <=numone ; a++)
        {
            for(int b = 1 ; b <=a ; b++){
            	if(a>=b){ //if a>=b right angle at the bottom left
                    System.out.print("*");}}
          System.out.println();
        }
		System.out.println();
        int i,j,k;
        for(i = 1 ; i<=numone ; i++)//numbers of layers of for loops
        {
            for( j = 1 ; j <=i ; j++)//According to the outer line number, output the space to left of asterisk
                System.out.print(" ");
            for(k = 1 ; k <=numone-i+1 ; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();   
        int num = 1 ; 
        for(int a =1 ; a <=numone ; a++)
        {
        	

        	for(int b = 1 ; b <=a ; b++ )
                     {System.out.format("%-3d",num++);}
                 System.out.println();
        }
	}

}

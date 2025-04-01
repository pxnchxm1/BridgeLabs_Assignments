import java.util.Scanner;
public class MaxOfThree{
	public static int maxAns(int a ,int b,int c){
		if(a>=b && a>=c){
			return a;	
		}else if(b>=c && b>=a){
			return b;	
		}else{
			return c;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : " );
		int a =sc.nextInt();
		System.out.println("Enter num : " );
		int b =sc.nextInt();
		System.out.println("Enter num : " );
		int c =sc.nextInt();
		System.out.println( maxAns(a,b,c) + "is greatest of three !! " );
		
	}
}
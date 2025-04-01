import java.util.Scanner;
public class Fibonacci{
	public static void fib(int num ){
	    int a =0;
		int b=1;
		System.out.print(a + " " + b);
		for(int i=0;i<num;i++){
			int c = a+b;
			System.out.print(" " + c + " ");
			a=b;
			b=c;
			
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : " );
		int num =sc.nextInt();
		fib(num);
	
	}
}
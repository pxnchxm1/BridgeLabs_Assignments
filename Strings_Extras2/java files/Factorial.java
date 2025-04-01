import java.util.Scanner;
public class Factorial{
	public static int fact(int n ){
	   if(n==0){
		   return 1;
	   }else{
		   return n * fact(n-1);
	   }
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : " );
		int num=sc.nextInt();
		System.out.println("factorial " + fact(num));
		sc.close();
	
	}
}
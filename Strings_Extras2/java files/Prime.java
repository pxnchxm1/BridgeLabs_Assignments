import java.util.Scanner;
public class Prime{
	public static boolean isPrime(int a ){
		for(int i=2;i<a;i++){
			if(a%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : " );
		int a =sc.nextInt();
		
		System.out.println( "Is prime ? " + isPrime(a) );
		
	}
}
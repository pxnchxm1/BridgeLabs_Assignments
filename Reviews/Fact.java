
//program to check factorial of a number
import java.util.Scanner;
public class Fact{
	public static int factorial(int n){
		int f = 1;
		for(int i=1;i<=n;i++){
			f*=i;
		}
		return f;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("factorial is " + Fact.factorial(n));
		
		
	}
}
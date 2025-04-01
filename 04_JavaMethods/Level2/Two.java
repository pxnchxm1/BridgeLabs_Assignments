import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Two{
	
	public int recursiveSum(int n){
		if(n==0){
			return 0;
		}
		else{
			return (n + recursiveSum(n-1));
		}
	}
	public int formulaeSum(int n){
		return (( n * ( n + 1 )) /2 );
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		Two two = new Two();
		System.out.println("The result using recursion  : " + two.recursiveSum(num));
		System.out.println("The result using formulae  : " + two.formulaeSum(num));
		System.out.println("Are they both same ? " + (two.recursiveSum(num)== two.formulaeSum(num)));
		
	}
}
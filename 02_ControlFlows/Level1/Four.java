import java.util.Scanner;

public class Four {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural number : ");
		int n = sc.nextInt();
		int s ;
		if(n>=0){
			s = ( n * ( n + 1 ) ) / 2 ;
			System.out.println("The sum of " + n + " natural numbers is "+ s);
		}else{
			System.out.println("The number " + n + " is not a natural number");
		}
	}
}
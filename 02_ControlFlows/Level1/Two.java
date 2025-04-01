import java.util.Scanner;
public class Two{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("\nEnter second number : ");
		int b = sc.nextInt();		
		System.out.print("\nEnter third number : ");
		int c = sc.nextInt();
		String res = ( ( a < b ) && ( a < c ) ) ? "Yes" : "No" ;
		System.out.println(" Is the first number the smallest? " + res);
		
	}
}
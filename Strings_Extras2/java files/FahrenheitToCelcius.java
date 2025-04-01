import java.util.Scanner;
public class FahrenheitToCelcius{
	public static int fToC(int f){
		
		return ( (5 *( f- 32)/9) );
	}
	public static int cToF(int c ){
		return ((c* 9/5 )+32);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fahrenheit : " );
		int num1 =sc.nextInt();
		System.out.println("To celcius : " + fToC(num1));
		System.out.println("Enter num2 : " );
		int num2 =sc.nextInt();
		System.out.println("To fahrenheit : " + cToF(num2));
		sc.close();
	
	}
}
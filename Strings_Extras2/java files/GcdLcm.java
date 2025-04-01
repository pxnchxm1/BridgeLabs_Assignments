import java.util.Scanner;
public class GcdLcm{
	public static int gcd(int a ,int b){
		while(b!=0){
			int t = b;
			b = a%b ;
			a = t;
		}
		return a;
	}
	public static int lcm(int a ,int b){
		
		return ((a /(gcd(a,b))) * b);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : " );
		int num1 =sc.nextInt();
		System.out.println("Enter num2 : " );
		int num2 =sc.nextInt();
		
		System.out.println("GCD " + gcd(num1,num2));
		System.out.println("LCM " + lcm(num1,num2));
		sc.close();
	
	}
}
import java.util.Scanner;
public class ProblemOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int sum = a+b;
		int dif = a-b;
		int mul = a*b ;
		int quotient = a/b;
		System.out.println(String.format("The addition, subtraction, multiplication, and division value of 2 numbers %d and %d is %d,%d,%d,%d",a,b,sum,dif,mul,quotient));

	}
}
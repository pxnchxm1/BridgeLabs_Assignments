import java.util.Scanner;
public class ProblemSix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int a  = sc.nextInt();
		System.out.println("Enter num2");
		int b = sc.nextInt();
		
		System.out.println(String.format("The Quotient is %d and Reminder is %d of two number %d and %d",a/b,a%b,a,b));
		
		
	}
}
import java.util.Scanner;
public class ProblemEight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		double a  = sc.nextInt();
		System.out.println("Enter num2");
		double b = sc.nextInt();
		System.out.println("Enter num3");
		double c = sc.nextInt();
		double r1 = a + b *c;
		double r2= a * b + c  ;
		double r3=  c + a / b ;
		double r4 = a % b + c;
		
		System.out.println(String.format(" The results of Int Operations are %.2f,%.2f,%.2f and %.2f",r1,r2,r3,r4));
		
		
	}
}
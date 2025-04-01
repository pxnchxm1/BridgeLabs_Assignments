import java.util.Scanner;
public class ProblemSeven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int a  = sc.nextInt();
		System.out.println("Enter num2");
		int b = sc.nextInt();
		System.out.println("Enter num3");
		int c = sc.nextInt();
		int r1 = a + b *c;
		int r2= a * b + c  ;
		int r3=  c + a / b ;
		int r4 = a % b + c;
		
		System.out.println(String.format(" The results of Int Operations are %d,%d,%d and %d",r1,r2,r3,r4));
		
		
	}
}
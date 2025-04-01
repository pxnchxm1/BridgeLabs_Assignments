import java.util.Scanner;

public class Three{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int a = sc.nextInt();
		System.out.print("\nEnter num2 : ");
		int b = sc.nextInt();
		System.out.print("\nEnter num3 : ");
		int c = sc.nextInt();
		boolean isFirst = ( a>b && a>c);
		boolean isSecond = ( b>c && b>a);
		boolean isThird = (c>a && c>b);
		System.out.println("Is the first number the largest? " + isFirst );
		System.out.println("Is the second number the largest? " + isSecond );
		System.out.println("Is the third number the largest? " + isThird);	
	}
	
}
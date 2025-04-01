import java.util.Scanner;
public class ProblemTen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height : ");
		int cm = sc.nextInt();
		double inch = cm / 2.54 ;
		double feet = inch / 12 ;
		System.out.println(String.format(" Your Height in cm is %d while in feet is %.2f and inches is %.2f",cm,feet,inch));
	}
}
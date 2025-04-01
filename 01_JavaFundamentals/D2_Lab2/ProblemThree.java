import java.util.Scanner;
public class ProblemThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side");
		double s = sc.nextDouble();
		double permiter = 4*s ;
		System.out.println(String.format("The length of the side is %.2f whose perimeter is %.2f",s,permiter));
		
		
	}
}
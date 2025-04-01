import java.util.Scanner;
public class ProblemEight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the km : ");
		double km = sc.nextInt();
		double miles = km * 1.6;
		System.out.println(String.format("The total miles is %.2f mile for the given %.2f km",miles,km));
	}
}
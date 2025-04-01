import java.util.Scanner;
public class ProblemFour{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in feet");
		double feet = sc.nextInt();
		double yards = feet/3;
		double miles = yards / 1760 ;
		System.out.println(String.format("The distance in yards is %.2f while the distance in miles is %.2f",yards,miles));
		
		
	}
}
import java.util.Scanner ;
import java.lang.Math;
public class Nine{
	public static double euclidianDistance(double a,double b,double c,double d){
		return Math.sqrt(Math.pow(c-a,2)) + Math.sqrt(Math.pow(d-b,2));
	}
	public static void equationLine(double x1,double y1,double x2,double y2){
		double m = (y2-y1)/(x2-x1) ;
		double b = y1 - (m*x1) ;
		System.out.println(String.format("Equation of line : y = %.1f x + %.1f",m,b));
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 : ");
		double x1 = sc.nextDouble();
		System.out.println("enter y1 : ");
		double y1 = sc.nextDouble();
		System.out.println("enter x2 : ");
		double x2 = sc.nextDouble();
		System.out.println("enter y2 : ");
		double y2 = sc.nextDouble();
		double euc = Nine.euclidianDistance(x1,y1,x2,y2);
		System.out.println("Euclidean distance : " + euc);
		Nine.equationLine(x1,y1,x2,y2);
		
	}
	
}
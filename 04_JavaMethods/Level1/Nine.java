import java.util.Scanner ;
import java.lang.Math;
public class Nine{
	public static double[] qAndR(double a ,double b){
		double[] res = new double[2];
		res[0] = a/b;
		res[1]=a%b;
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		double a = sc.nextInt();
		System.out.println("Enter number 2: ");
		double b = sc.nextInt();
		double[] ans = Nine.qAndR(a,b);
		System.out.println("Quotient : " + ans[0] +" Remainder : " +ans[1]);
	}
}
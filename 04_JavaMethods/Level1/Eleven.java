import java.util.Scanner ;
import java.lang.Math;
public class Eleven{
	public static double chillTemperature(double t , double s){
		double res = 35.74 + (0.6215 * t ) + (0.4275 * t - 55.75) * Math.pow(s,0.16) ;
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		double temp = sc.nextDouble();
		System.out.println("Enter the windspeed: ");
		double speed = sc.nextDouble();
		System.out.println("Chill Temperature : " + Eleven.chillTemperature(temp,speed));
	}
}
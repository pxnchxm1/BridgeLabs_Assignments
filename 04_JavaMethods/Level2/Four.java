import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Four{
	public static double kmToMiles(double km){
		return km * 0.621 ;
	}
	public static double milesToKm(double miles){
		return miles * 1.60934 ;
	}
	public static double feetToMetres(double feet){
		return feet* 0.3048 ;
	}
	public static double metresToFeet(double m){
		return m* 3.28084 ;
	}
	public static void main(String[] args){
		System.out.println(40000 +"km = "+ kmToMiles(40000.0) + "miles");
		System.out.println(4 + "miles = "+ milesToKm(4) + "km");
		System.out.println(6 + "feet = "+ feetToMetres(6.0) + "metres");
		System.out.println(200+ "metres = "+ metresToFeet(200.0) + "feet");
	
		
	}
}
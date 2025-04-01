import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Six{
	public static double fahToCel(double f){
		return ((f - 32 )* 5 / 9);
	}
	public static double celToFah(double c){
		return ( c * (9/5) + 32 ); 
	}
	public static double poundsToKg(double p){
		return ( p * 0.453592 ) ;
	}
	public static double kgToPounds(double kg){
		return ( kg * 2.20462 ) ;
	}
	public static double gallonsToLitres(double g){
		return (g * 3.78541);
	}
	public static double litresToGallon(double l){
		return (l * 0.264172);
	}
	public static void main(String[] args){
		System.out.println(400 +"fahrenheit = "+ fahToCel(400.0) + " celcius");
		System.out.println(40 + "celcius = "+ celToFah(40.0) + "fahrenheit");
		System.out.println(40 + "pounds = "+ poundsToKg(40.0) + " kg");
		System.out.println(40+ "kg = "+ kgToPounds(40.0) + " pounds");
		System.out.println(40+ "gallons = "+ gallonsToLitres(40.0) + " litres ");
	    System.out.println(40+ "litres = "+ litresToGallon(40.0) + " gallon ");
		
	}
}
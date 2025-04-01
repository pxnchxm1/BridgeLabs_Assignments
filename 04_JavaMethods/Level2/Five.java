import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Five{
	public static double yardsToFeet(double yards){
		return yards * 3 ;
	}
	public static double feetToYards(double feet){
		return feet * 0.33333 ;
	}
	public static double inchesToMetres(double inch){
		return inch* 0.0254 ;
	}
	public static double metresToInches(double m){
		return m* 39.3701 ;
	}
	public static double inchesToCm(double inch){
		return inch * 2.54 ;
	}
	public static void main(String[] args){
		System.out.println(40000 +"yards = "+ yardsToFeet(40000.0) + " feet");
		System.out.println(4 + "feet = "+ feetToYards(4.0) + "yards");
		System.out.println(35 + "inches = "+ inchesToMetres(35.0) + " metres");
		System.out.println(200+ "metres = "+ metresToInches(200.0) + " inches");
		System.out.println(25+ "inches = "+ inchesToCm(25.0) + " cm ");
	
		
	}
}
import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Three{
	
	public static boolean leap(int n){
		if( n>1582 && ( (n%4==0) && (n%100!=0))|| (n%400 ==0) ){
			return true;
		}
		return false;	
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year ");
		int year = sc.nextInt();
		System.out.println( Three.leap(year) ? "Leap Year":"Not a Leap Year" );
		
		
	}
}
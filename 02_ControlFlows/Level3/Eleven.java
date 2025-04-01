import java.util.Scanner;
public class Eleven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year :  ");
		int y = sc.nextInt();
		System.out.print("Enter the month:  ");
		int m = sc.nextInt();
		System.out.print("Enter the date :  ");
		int d = sc.nextInt();
		double y0 = y - ( 14 - m ) / 12 ;
		double x = (y0 + (y0/4) - (y0/100) + (y0/400) );
		double m0 = m + 12 * (( 14 - m ) / 12 ) - 2 ;
		double d0 = ((d + x + (31*m0)) / 12) % 7 ;
		System.out.println((int)d0);
        sc.close();
	
	}
}
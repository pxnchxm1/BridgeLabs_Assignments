import java.util.Scanner ;
import java.lang.Math;
public class Ten{
	public static boolean collinearUsingTriangle(double x1,double y1,double x2,double y2,double x3,double y3){
		return (0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) == 0.0);

	}
	public static boolean isCollinearSlope(double x1,double y1,double x2,double y2,double x3,double y3){
		int ab = (int)((y2-y1) / (x2-x1));
		int bc = (int)((y3-y2)/(x3-x2));
		int ac = (int)((y3-y1)/(x3-x1)); 
		return (ab==bc && bc==ab );
		
		
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
		System.out.println("enter x3 : ");
		double x3 = sc.nextDouble();
		System.out.println("enter y3 : ");
		double y3 = sc.nextDouble();
		System.out.println("Using Triangle formulae ...Is Collinear -- " +Ten.collinearUsingTriangle(x1,y1,x2,y2,x3,y3));
		System.out.println("Using Slope formulae ...Is Collinear -- " +Ten.isCollinearSlope(x1,y1,x2,y2,x3,y3));
		
	}
	
}
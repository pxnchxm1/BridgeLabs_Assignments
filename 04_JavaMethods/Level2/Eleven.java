import java.util.Scanner ;
import java.lang.Math;
public class Eleven{
	public double[] roots(double a ,double b,double c){
		double[] r = {0.0,0.0};
		double delta =  ( b*b ) - (4*a*c);
		if(delta >= 0){
			if(delta == 0){
				r[0] = (-b) / (2*a)  ;
			    r[1] = 0;
			}else{
				r[0] = ((-b) + Math.sqrt(delta)) /(2*a) ;
				r[1] = ((-b) - Math.sqrt(delta)) /(2*a) ;
			}
			
		}
		return r;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coeffiecient of x2 :a ");
		double a = sc.nextDouble();
		System.out.println("Enter coeffiecient of x : b");
		double b = sc.nextDouble();
		System.out.println("Enter constant : c ");
		double c = sc.nextDouble();
		Eleven el = new Eleven();
		double[] ans = el.roots(a,b,c);
		if(ans[0]==0 && ans[1]==0){
			System.out.println("No roots , imaginary");
		}else if(ans[1]==0){
			System.out.println("Only one root : "+ans[0]);
		}else{
			System.out.println("Roots are : "+ans[0]+ " and "+ ans[1]);
		}
		
		sc.close();
	}
	
}
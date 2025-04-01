import java.util.Scanner ;
import java.lang.Math;
public class Twelve{
	public static double[] trignoFunctions(double degree){
		double[] res = new double[3];
		res[0] = Math.sin(degree);
		res[1] = Math.cos(degree);
		res[2] = res[0] / res[1] ;
		return res;
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the degree: ");
		double d = sc.nextDouble() * (3.14 / 180 );
		double[] ans = Twelve.trignoFunctions(d);
		System.out.println("Sin : " + ans[0] + " Cosine : " + ans[1]+" Tan : " + ans[2]);
	}
}
import java.util.Scanner;
public class ProblemTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		int b = sc.nextInt();
		System.out.println("Enter height");
		int h = sc.nextInt();
		double areaInCm = 0.5 * b * h;
		double areaInInch = areaInCm / (2.54*2.54);
		System.out.println(String.format("The Area of the triangle in sq in is %.2f and sq cm is %.2f",areaInInch,areaInCm));
		
		
	}
}
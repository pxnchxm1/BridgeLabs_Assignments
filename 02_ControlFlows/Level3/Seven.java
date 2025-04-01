import java.util.Scanner;
public class Seven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight (in kg) :  ");
		double w = sc.nextDouble();
		System.out.print("Enter the height (in cm) :  ");
		double hcm = sc.nextDouble();
		double h = hcm * 0.01;
		double bmi = (w / ( h * h )) ;
		System.out.println("Your bmi is "+ bmi);
        if(bmi<=18.4){
			System.out.println("Underweight");
			
		}else if( bmi>=18.5 && bmi<=24.9 ) {
			System.out.println("Normal");
		}
		else if( bmi>=25.0 && bmi<=39.9 ) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
		
		
	}
}
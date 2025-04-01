import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Ten{
	public static void bmi(double[][] arr){
		for(int i=0;i<arr.length;i++){
			double bmi = arr[i][0] / ( arr[i][1] * arr[i][1]) ;
			arr[i][2] = bmi;
			String status = "";
				if(bmi<=18){
					status = "Underweight";
				}else if(bmi>=18.5 && bmi<=24.9){
					status="Normal";
					
				}else if(bmi>=25.0 && bmi<=35.9){
					status="Overweight";
				}else{
					status = "Obese";
				}
			System.out.print(String.format("\nHeight : %.2f, Weight : %.2f, BMI : %.2f ",arr[i][1],arr[i][0],arr[i][2]));
			System.out.print("Status is : "+ status);
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[][] arr = new double[10][3];
		System.out.println("Enter weight and height of 10 people : ");
		for(int i =0;i<arr.length;i++){
			System.out.println("Enter weight : ");
			arr[i][0] = sc.nextDouble();
			System.out.println("Enter height : ");
			arr[i][1] = sc.nextDouble()*0.01;
		}
		Ten.bmi(arr);
		sc.close();
	}
	
}
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class Six{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number  : " );
			int n = sc.nextInt();
            double[] h = new double[n];
			double[] w = new double[n];
			double[] b = new double[n];
			String[] statusArr = new String[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter height of person : " +(i+1));
				h[i] = sc.nextDouble()*0.01;
				System.out.println("Enter weight of person : " +(i+1));
				w[i] = sc.nextDouble();
				double bmi = (w[i] )/(Math.pow(h[i],2));	
                b[i] = bmi;
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
				statusArr[i]=status;				
			}
			
			for(int i = 0;i<n;i++){
				System.out.print(String.format("\nHeight : %.2f, Weight : %.2f, BMI : %.2f ",h[i],w[i],b[i]));
				System.out.print("Status is : "+ statusArr[i]);
				
			}
			
			sc.close();
	}
}
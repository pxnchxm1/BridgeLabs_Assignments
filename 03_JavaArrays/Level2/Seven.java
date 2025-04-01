import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class Seven{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number  : " );
			int n = sc.nextInt();
            double[][] arr = new double[n][3];
			String[] statusArr = new String[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter height of person : " +(i+1));
				arr[i][0] = sc.nextDouble()*0.01;
				System.out.println("Enter weight of person : " +(i+1));
				arr[i][1] = sc.nextDouble();
				double bmi = (arr[i][1] )/(Math.pow(arr[i][0],2));	
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
				statusArr[i]=status;				
			}
			
			for(int i = 0;i<n;i++){
				System.out.print(String.format("\nHeight : %.2f, Weight : %.2f, BMI : %.2f ",arr[i][0],arr[i][1],arr[i][2]));
				System.out.print("Status is : "+ statusArr[i]);
				
				
			}
			
			sc.close();
	}
}
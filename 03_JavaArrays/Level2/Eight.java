import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class Eight{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number  : " );
			int n = sc.nextInt();
            double[] p = new double[n];
			double[] c = new double[n];
			double[] m = new double[n];
			double[] percentage = new double[n];
			double[] total = new double[n];
			char[] gradeArr = new char[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter physics mark of student : " +(i+1));
				p[i]= sc.nextDouble();
				System.out.println("Enter chemistry mark of student : " +(i+1));
				c[i]= sc.nextDouble();
				System.out.println("Enter maths mark of student : " +(i+1));
				m[i] = sc.nextDouble();
				total[i] = (p[i]+c[i]+m[i])	;
                percentage[i] = ((total[i])/300 )* 100;
                char grade;
				if(percentage[i]>=80.0){
					grade = 'A';
				}else if(percentage[i]>=70.0 && percentage[i]<=79.0){
					grade = 'B';
				}else if(percentage[i]>=60.0 && percentage[i]<=69.0){
					grade = 'C';
				}else if(percentage[i]>=50.0 && percentage[i]<=59.0){
					grade = 'D';
				}else if(percentage[i]>=40.0 && percentage[i]<=49.0){
					grade = 'E';
				}else{
					grade = 'R';
					
				}
				gradeArr[i]=grade;				
			}
			
			for(int i = 0;i<n;i++){
				System.out.print(String.format("\nPhysics : %.2f, Chemistry : %.2f, Maths : %.2f ,Total : %.2f, Percentage :%.2f",p[i],c[i],m[i],total[i],percentage[i]));
				System.out.print("Status is : "+ gradeArr[i]);
				
			}
			
			sc.close();
	}
}
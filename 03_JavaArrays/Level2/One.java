import java.util.Scanner;
public class One{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[][] oldSalYear = new double[10][2];
		double[][] newSalBonus = new double[10][2];
		double totalBonus = 0.0;
		double totalOldSal = 0.0;
		double totalNewSal = 0.0;
		for(int i=0;i < oldSalYear.length; i++){
			System.out.println("Enter your current salary : ");
			oldSalYear[i][0] = sc.nextDouble();
			System.out.println("Enter your years of experience: ");
			oldSalYear[i][1] = sc.nextDouble();
			while(oldSalYear[i][0]<0){
				System.out.println("Invalid Salary amount . Enter your current salary again: ");
				oldSalYear[i][0] = sc.nextDouble();
			}
			while(oldSalYear[i][1]<0){
				System.out.println("Invalid years . Enter your years of experience again: ");
				oldSalYear[i][1] = sc.nextDouble();
			}
		}
		for(int i=0;i<newSalBonus.length;i++){
			double bonus = 0.0;
			double newSalary = 0.0;
			if(oldSalYear[i][1]>=5){
				bonus = (0.05) * (oldSalYear[i][0]) ;
				
			}else{
				bonus = (0.02) * (oldSalYear[i][0]) ;
			}
			newSalBonus[i][0] = bonus + oldSalYear[i][0];
			newSalBonus[i][1] = bonus ;
			totalBonus += bonus ;
			totalOldSal += oldSalYear[i][0];
			totalNewSal += newSalary;
		}
		System.out.println("Given below the old salary and experience in years as well as their new salary and bonus :");
		for(int i=0;i<10;i++){
			System.out.println(String.format("Old salary : %.2f , Experience : %.0f , Bonus : %.2f, New Salary : %.2f",oldSalYear[i][0],oldSalYear[i][1],newSalBonus[i][1],newSalBonus[i][0]));
		}
		System.out.println(String.format("Total Old Salary : %.2f,\nTotal Bonus : %.2f,\nTotal Old Salary : %.2f",totalOldSal,totalBonus,totalNewSal));
		sc.close();
	}
}
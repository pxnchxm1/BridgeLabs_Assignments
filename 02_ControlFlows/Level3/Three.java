import java.util.Scanner;
public class Three{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the physics mark (1-100) :  ");
		int p = sc.nextInt();
		System.out.print("\nEnter the chemistry mark  (1-100) : ");
		int c = sc.nextInt();
		System.out.print("\nEnter the maths mark (1-100) : ");
		int m = sc.nextInt();
		int percentage = ((p+c+m) * 100 ) /300;
		if(percentage>=80){
			System.out.println("Your Percentage : "+percentage+"% -- Grade : A -- Remarks : Level4 - Above agency-normalize stndards");
			
		}else if( percentage <= 79 && percentage >= 70 ){
			System.out.println("Your Percentage : "+percentage+"% -- Grade : B -- Remarks : Level3 - At agency-normalize stndards");
		}else if( percentage <= 69 && percentage >= 60 ){
			System.out.println("Your Percentage : "+percentage+"% -- Grade : C -- Remarks : Level2 - Below,but approaching agency-normalize stndards");
		}else if( percentage <= 59 && percentage >= 50 ){
			System.out.println("Your Percentage : "+percentage+"% -- Grade : D -- Remarks :Level 1 - Well below agency-normalize stndards");
		}else if( percentage <= 49 && percentage >= 40 ){
			System.out.println("Your Percentage : "+percentage+"% -- Grade : E -- Remarks :Level 1 - too below agency-normalize stndards");
			
		}else{
			System.out.println("Your Percentage : "+percentage+"% -- Grade : R -- Remarks :Remedial Standards");
		}
		
		
		
		
	}
}
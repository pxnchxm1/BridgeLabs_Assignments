import java.util.Scanner;
public class Seventeen {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your work experience in years " );
		int y = sc.nextInt();
		System.out.println("Enter your salary " );
		int sal = sc.nextInt();
		double bonus=0.0;
		if( y > 5 ){
			bonus = sal * 0.05;
		}
		System.out.println( bonus==0 ? ("No bonus for you. sorry !"): (" Your bonus amount is"+bonus));
		
	}
}
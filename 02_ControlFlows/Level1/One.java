import java.util.Scanner;
public class One{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		boolean ans = false ;
		if( number % 5 == 0 ){
			ans = true ;
		}
		System.out.println("\nIs the number " + number +" divisible by 5 ? " + ans);
		sc.close();
	}
}
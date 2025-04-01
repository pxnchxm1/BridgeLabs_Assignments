import java.util.Scanner;
public class Eight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the counter value : ");
		int n = sc.nextInt();
		System.out.println("The countdown from " + n + " starts now !");
		while(n!=0){
			System.out.println("Countdown : " + n);
			n--;
		}
		System.out.println("Launched !!");
		
	}
}
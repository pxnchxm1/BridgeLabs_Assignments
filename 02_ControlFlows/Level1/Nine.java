import java.util.Scanner;
public class Nine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the counter value : ");
		int n = sc.nextInt();
		System.out.println("The countdown from " + n + " starts now !");
		for(int i=n;i>0;i--){
			System.out.println("The count : " + n);
			n--;
		}
		System.out.println("Launched !!");
		
	}
}
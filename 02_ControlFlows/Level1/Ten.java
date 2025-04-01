import java.util.Scanner;
public class Ten{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		System.out.println("Enter a number ");
		double num = sc.nextDouble();
		while(num!=0){
			total+=num;
			System.out.println("Enter a number again ");
			num = sc.nextDouble();
		}
		System.out.println("The total is " + total);
		
		
	}
}
import java.util.Scanner;
public class Fifteen {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number " );
		int n = sc.nextInt();
		int fact=1;
		if(n<0){
			System.out.println("invalid number");
		}else{
			for(int i=1;i<=n;i++){
				fact *= i;
			}
			System.out.println("Factorial is : " + fact);
		}
		
	}
}
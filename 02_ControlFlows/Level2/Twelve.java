import java.util.Scanner;
public class Twelve{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int base = sc.nextInt();
		System.out.println("Enter the power : ");
		int pow = sc.nextInt();
		int res = 1;
		for(int i=1;i<=pow;i++){
			res*=base;
		}
		System.out.println(String.format("%d to the power of %d is %d",base,pow,res));
		
		sc.close();
	}
}
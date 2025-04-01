import java.util.Scanner;
public class Fourteen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int base = sc.nextInt();
		System.out.println("Enter the power : ");
		int pow = sc.nextInt();
		int res = 1;
		int i = 1;
		while(i!=pow+1){
			res*=base;
			i++;
		}
		System.out.println(String.format("%d to the power of %d is %d",base,pow,res));
		
		sc.close();
	}
}
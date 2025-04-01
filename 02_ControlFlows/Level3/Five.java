import java.util.Scanner;
import java.lang.Math;
public class Five{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:  ");
		int n = sc.nextInt();
		int num = n;
		double res = 0 ;
        while(num!=0){
			int unitDigit = num%10 ;
			res += Math.pow(unitDigit,3);
			num/=10;	
		}
		if(n==res){
			System.out.println("Armstrong");
		}else{
			System.out.println("Not an armstrong");
		}
		
		
	}
}
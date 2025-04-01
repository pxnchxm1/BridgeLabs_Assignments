import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Five{
	
	
	public static boolean isPrime(int number){
		for(int i=2; i<number ; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean neon(int number){
		int num = number*number;
		int sum=0;
		while(num!=0){
			sum += (num%10);
			num/=10;
		}
		return sum==number;
	}
	public static boolean spy(int number){
		int s = 0;
		int p = 1;
		int num = number;
		while(num!=0){
			s += (num%10);
			p *= (num%10);
			num/=10;
		}
		return p==s;
		
		
	}
	public static boolean automorphic(int number){
		int sq = number * number ;
        return Integer.toString(sq).endsWith(Integer.toString(number));
	}
	public static boolean buzz(int number){
        return (number%10==7 || number%7==0);
	}
	
	
	public static void main(String[] args){
		Five five = new Five();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Is Prime : " + five.isPrime(n));
		System.out.println("Is neon : " +  five.neon(n));
		System.out.println("Is spy : " +  five.spy(n));
		System.out.println("Is automorphic : " +  five.automorphic(n));
		System.out.println("Is buzz : " +  five.buzz(n));
	}
	
}
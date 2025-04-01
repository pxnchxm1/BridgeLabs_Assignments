import java.util.Scanner;
import java.lang.Math;
public class Six{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:  ");
		int num = sc.nextInt();
		int res = 0 ;
        while(num!=0){
			int unitDigit = num%10 ;
			res ++;
			num/=10;	
		}
		System.out.println("Number of digits in the given number is " + res);
		
		
	}
}
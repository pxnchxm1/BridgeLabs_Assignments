import java.util.Scanner;
import java.util.Arrays;
public class Five{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number (less than a 10 digit number) : " );
			int n = sc.nextInt();
			int maxDigit = Integer.toString(n).length();
			int[] digits = new int[maxDigit];
			int idx= 0;
			while(n!=0 || idx != maxDigit){
				digits[idx] = n%10;
				n/=10;
				idx++;
			}
			System.out.println("Reversed Array is : " + Arrays.toString(digits));
			sc.close();
	}
}
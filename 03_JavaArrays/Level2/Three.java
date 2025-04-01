import java.util.Scanner;
import java.util.Arrays;
public class Three{
	public static void main(String[] args){
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number (less than a 10 digit number) : " );
			int n = sc.nextInt();
			int maxDigit = Integer.toString(n).length();
			int[] digits = new int[maxDigit];
			int idx= maxDigit-1;
			while(n!=0 || idx>0){
				digits[idx] = n%10;
				n/=10;
				idx--;
			}
			int lg=Integer.MIN_VALUE; ;
			int scLg=digits[0];
			for(int i=0;i<digits.length;i++){
				if(digits[i]>lg && digits[i]!=lg && scLg!=lg){
					scLg=lg;
					lg = digits[i];
				} 
				
			}
			System.out.println("Array is : " + Arrays.toString(digits));
			System.out.println("Second largest : " + scLg +" Largest : " +lg);
			
			sc.close();
		
	}
}
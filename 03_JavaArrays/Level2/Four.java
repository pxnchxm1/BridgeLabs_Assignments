import java.util.Scanner;
import java.util.Arrays;
public class Four{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number  : " );
			int n = sc.nextInt();
			int maxDigit = 10;
			int[] digits = new int[maxDigit];
			int idx= 0;
			while(n!=0 ){
				if(idx==maxDigit){
					maxDigit+=10;
					int[] temp = new int[maxDigit];
					System.arraycopy(digits,0,temp,0,digits.length);
					digits = temp;
				}
				digits[idx] = n%10;
				n/=10;
				idx++;
			}
			int lg=Integer.MIN_VALUE; 
			int scLg=digits[0];
			for(int i=0;i<idx;i++){
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
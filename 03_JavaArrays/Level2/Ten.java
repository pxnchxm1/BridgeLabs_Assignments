import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class Ten{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number  : " );
			int n = sc.nextInt();
			int size = (Integer.toString(n)).length();
			int[] digits = new int[size];
			int idx=0;
			while(n!=0){
				digits[idx] = n%10;
				n/=10;
				idx++;
			}
			int[] freq = new int[10];
			Arrays.fill(freq,0);
			for(int i = 0;i<idx;i++){
				freq[digits[i]]+=1;
			}
			for(int i=0;i<freq.length;i++){
				if(freq[i]!=0){
					System.out.println("Frequency of " + i +" is " +freq[i]);
				}
			}
			
			
			sc.close();
	}
}
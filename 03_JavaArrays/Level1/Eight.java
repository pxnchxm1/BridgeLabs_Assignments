import java.util.Scanner;
import java.util.Arrays;
public class Eight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : " );
		int n = sc.nextInt();
		int maxFactor = 10 ;
		int[] factors = new int[maxFactor] ;
		int idx=0;
		for(int i=1;i<=n;i++){
			if(idx==maxFactor){
				break;
			}
			if (n%i==0){
				factors[idx]=i;
				idx++;
			}
			
		}
		System.out.println("Factors are :" + Arrays.toString(factors));
		
		sc.close();
	}
}
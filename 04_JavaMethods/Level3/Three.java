import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Three{
	public static int countOfDigits(int num){
		int res=0;
		int n = num;
		while(n!=0){
			res+=1;
			n/=10;
		}
		return res;
	} 
	public static int[] generateArray(int number,int c){
		int[] arr = new int[c];
		int digits = number;
		int idx=c-1;
		while(digits!=0){
			arr[idx] = digits%10;
			digits/=10;
			idx--;
		}
		return arr;
	}
	
	public static int sumOfArray(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
	public static int squareSum(int[] arr){
		int ssum = 0;
		for(int i=0;i<arr.length;i++){
			ssum += Math.pow(arr[i],2);
		}
		return ssum;
	}
	
	
	public static boolean isHarshad(int number,int sum){
		return number==sum ;
	}
	public static void freq(int[] arr){
		int[] freqs = new int[10];
		Arrays.fill(freqs,0);
		for(int i=0;i<arr.length;i++){
			freqs[arr[i]] +=1;
		}
		for(int i=0;i<freqs.length;i++){
			if(freqs[i]!=0){
				System.out.println("Frequency of "+ i + " : "+freqs[i]);
			}
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int count = Three.countOfDigits(number);
		System.out.println("No of digits : " + count);
		int[] arr = Three.generateArray(number,count );
		System.out.println("Digit array : " + Arrays.toString(arr));
		int s = Three.sumOfArray(arr);
		System.out.println("Sum of digits of the number ? " + s );
		int ss = Three.squareSum(arr);
		System.out.println("Harshad : " + Three.isHarshad(number,s));
		System.out.println("Sum of squares of digits of the number ? " + ss );
		Three.freq(arr);
	}
	
}
import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Four{
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
	
	public static int[] reverse(int[] arr){
		int res[] = new int[arr.length];
		for(int i = arr.length-1;i>=0;i--){
			res[arr.length-1-i] = arr[i] ;
		}
		return res;
	}
	public static boolean isPal(int[] arr,int[] reverse){
		return Arrays.equals(arr,reverse);
	}
	public static boolean duck(int[] arr){
		for(int i : arr){
			if(i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int count = Four.countOfDigits(number);
		System.out.println("No of digits : " + count);
		int[] arr = Four.generateArray(number,count );
		System.out.println("Digit array : " + Arrays.toString(arr));
		int[] rev = Four.reverse(arr);
		System.out.println("Reversed array : " + Arrays.toString(rev));
		System.out.println("Comparing two arrays :" + Arrays.toString(arr)+ " and " + Arrays.toString(rev) + "Result : " + Arrays.equals(rev,arr));
		System.out.println("Palindrome ? "+ Four.isPal(arr,rev));
		System.out.println("DuckArray : " + Four.duck(arr));
	}
	
}
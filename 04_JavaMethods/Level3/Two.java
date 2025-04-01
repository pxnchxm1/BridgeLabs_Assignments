import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Two{
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
	public static boolean duck(int[] arr){
		for(int i : arr){
			if(i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean armstrong(int[] arr, int number){
		int numberSum=0;
		for(int i=0;i<arr.length;i++){
			numberSum += Math.pow(arr[i],arr.length);
		}
		return (number == numberSum);
	}
	public static int[] smAndSecondSm(int[] arr){         //smallest = smallArray[0] ---- secondsmallest = smallArray[1]
		int[] smallArray = new int[2];
		smallArray[0] = arr[0];
		smallArray[1] = Integer.MAX_VALUE ;
		for(int i=0;i<arr.length;i++){
			smallArray[0] = Math.min(arr[i],smallArray[0]);
			if(smallArray[0] != arr[i]){
				smallArray[1] = Math.min(smallArray[1],arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++){
			if(smallArray[0] != arr[i]){
				smallArray[1] = Math.min(smallArray[1],arr[i]);
			}
		}
		
		return smallArray;
	}
	public static int[] lgAndsSecondLg(int[] arr){        
		int[] largeArray = new int[2];
		largeArray[0] = arr[0];
		largeArray[1] = Integer.MIN_VALUE ;
		for(int i=0;i<arr.length;i++){
			largeArray[0] = Math.max(arr[i],largeArray[0]);
			if(largeArray[0] != arr[i]){
				largeArray[1] = Math.min(largeArray[1],arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++){
			if(largeArray[0] != arr[i]){
				largeArray[1] = Math.max(largeArray[1],arr[i]);
			}
		}
		
		return largeArray;
	}
	
	public static void main(String[] args){
		Two two = new Two();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int count = Two.countOfDigits(number);
		System.out.println("No of digits : " + count);
		int[] arr = Two.generateArray(number,count );
		System.out.println("Digit array : " + Arrays.toString(arr));
		System.out.println("DuckArray : " + Two.duck(arr));
		System.out.println("Armstrong ? "+ Two.armstrong(arr,number));
		int[] sm = Two.smAndSecondSm(arr);
		System.out.println("Smallest : "+ sm[0] + "-- Second smallest :" + sm[1] );
		int[] lg = Two.lgAndsSecondLg(arr);
		System.out.println("Largest : "+ lg[0] + "-- Second largest :" + lg[1] );
	}
	
}
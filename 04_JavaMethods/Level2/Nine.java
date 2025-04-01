import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Nine{
	public static boolean isEven(int n){
		if(n%2==0) return true;
		return false;
		
	}
	public  boolean isPos(int n){
		if( n>=0){
			if(Nine.isEven(n)){
				System.out.println("Even number");
			}else{
				System.out.println("Odd number");
			}
			return true;
		}
		return false;	
	}
	public  void compareArray(int[] numbers){
		if(numbers[0]>=numbers[numbers.length-1]){
			if(numbers[0]==numbers[numbers.length-1]){
				System.out.println("first and last elements are equal");
			}else{
				System.out.println("first  element is greater than last element");
			}
		}else{
			System.out.println("last  element is greater than first element");
		}
	}
	public static int compare(int a ,int b){
		if(a>=b){
			if(a==b)return 0;
			return 1;
		}
		return -1;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		Nine nine = new Nine();
		for(int i =0;i<numbers.length;i++){
			System.out.println("Enter number : ");
			numbers[i] = sc.nextInt();
			System.out.println("Is Positive ? " + nine.isPos(numbers[i]));
		}
		System.out.println("Array is : " + Arrays.toString(numbers));
		nine.compareArray(numbers);
		
		System.out.println("Lets compare two numbers !! Enter 2 numbers seperated by space ");
		System.out.println("Result : " + nine.compare(sc.nextInt(),sc.nextInt()) + " \n note :: equal(0),1st greater(1) ,second greater(-1)");
		sc.close();
	}
	
}
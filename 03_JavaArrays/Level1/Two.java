import java.util.Scanner;
public class Two{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i< arr.length;i++){
			System.out.print("\nEnter a number : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				System.out.println(arr[i] + " is zero ");
			}else if( arr[i] > 0){
				System.out.println(arr[i] + " is positive ");
			}else{
				System.out.println(arr[i] + " is negative ");
			}
		}
		int first = arr[0];
		int last = arr[arr.length - 1 ];
		System.out.println(String.format("First element of array is %d and last element of the array is %d",first,last));
		if(first==last){
			System.out.println("They are equal");
		}else if(first>last){
			System.out.println(String.format("%d is larger than %d",first,last));
		}else{
			System.out.println(String.format("%d is larger than %d",last,first));
		}
		sc.close();
	}
}
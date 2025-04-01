import java.util.Scanner;
import java.util.Arrays;
public class Ten{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=1;i<=n;i++){
			if(i%3==0 && i%5==0){
				arr[i-1] = "FizzBuzz";
			}else if(i%3==0){
				arr[i-1] = "Fizz";
			}else if(i%5==0){
				arr[i-1] = "Buzz";
			}else{
				arr[i-1]= Integer.toString(i);
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println("Position " + (i+1) + "="+ arr[i]);
		}
		
		sc.close();
	}
}
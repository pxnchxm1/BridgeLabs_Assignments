import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Seven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : " );
		int n = sc.nextInt();
		if(n<0){
			System.err.println("Invalid number");
		}else{
			ArrayList<Integer> odd = new ArrayList<>();
			ArrayList<Integer> even = new ArrayList<>();
			for(int i=1;i<=n;i++){
				if(i%2==0){
					even.add(i);
				}else{
					odd.add(i);
				}
			}
			System.out.println("The odd array is : ");
			System.out.println(Arrays.toString(odd.toArray()));
			System.out.println("The even array is : ");
			System.out.println(Arrays.toString(even.toArray()));
			
			
		}
		
		sc.close();
	}
}
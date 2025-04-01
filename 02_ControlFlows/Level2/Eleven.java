import java.util.Scanner;
public class Eleven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		if(n>100 || n<0){
			System.out.println("Invalid");
		}else{
			for(int i=100;i>=1;i--){
				if(n%i==0){
					System.out.print(i + " ");
				}
			}
		}
			
		
		sc.close();
	}
}
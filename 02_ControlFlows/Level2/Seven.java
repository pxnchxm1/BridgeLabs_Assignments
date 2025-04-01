import java.util.Scanner;
public class Seven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("Factors of " + n + " are : \n");
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
			
		}
		sc.close();
	}
}
import java.util.Scanner;
public class Eight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("Factors of " + n + " are : \n");
		int i = 1;
		while(i<=n){
			if(n%i==0){
				System.out.print(i + " ");
			}
			i++;
		}
		sc.close();
	}
}
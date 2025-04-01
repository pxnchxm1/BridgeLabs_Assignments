import java.util.Scanner;
public class Eighteen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i=6;i<=9;i++){
			System.out.println(String.format(" %d * %d = %d",n,i,n * i));
		}
		sc.close();
	}
}
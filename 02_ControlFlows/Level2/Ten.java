import java.util.Scanner;
public class Ten{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int i = (n-1);
		while(i >= 1){
			if(n % i == 0 ){
				System.out.print("Greatest factor of "+ n +" is "+ i );
				break;
			}
			i--;
		}
		sc.close();
	}
}
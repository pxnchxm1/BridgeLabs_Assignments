import java.util.Scanner;
public class Five{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int n = sc.nextInt();
		System.out.println(" Multiplication table of "+ n + "from 6 to 9 is given below");
		int[] table = new int[4];
		int mul = 6 ;
		for(int i=0;i< 4;i++){
			table[i] = n * mul;
			System.out.println(String.format(" %d * %d = %d",mul,n,table[i]));
			mul++;
		}
		
		sc.close();
	}
}
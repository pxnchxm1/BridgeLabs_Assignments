import java.util.Scanner;
public class Three{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int n = sc.nextInt();
		System.out.println(" Multiplication table of "+ n + " is given below");
		int[] table = new int[n];
		for(int i=0;i< table.length;i++){
			table[i] = n * (i+1);
		}
		for(int i=0;i<table.length;i++){
			System.out.println(String.format(" %d * %d = %d",i+1,n,table[i]));
			
		}
		sc.close();
	}
}
import java.util.Scanner;
public class Thirteen {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : " );
		int num = sc.nextInt();
		int formulaeSum = (num * (num +1)) / 2 ;
		int calculatedSum = 0;
		for(int i = 0;i<=num;i++){
			calculatedSum +=i;
		}
		System.out.println("The sum is " + formulaeSum + " using the formulae and it is " + calculatedSum + " using the while loop calculation  and is both same ? " + (formulaeSum == calculatedSum));
	}
}
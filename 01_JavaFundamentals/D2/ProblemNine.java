import java.util.Scanner;
public class ProblemNine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fee : ");
		int fee = sc.nextInt();
		System.out.println("Enter the discount percentage : ");
		int discountPercent = sc.nextInt();
		int discount = fee * discountPercent / 100 ;
		int discountAmount = fee - discount;
		System.out.println(String.format(" The discount amount is INR %d and final discounted fee is INR %d",discount,discountAmount));
	}
}



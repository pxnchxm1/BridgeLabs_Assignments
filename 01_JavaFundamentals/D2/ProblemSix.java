public class ProblemSix{
	public static void main(String[] args){
		int fee = 125000;
		int discountPercent = 10;
		int discount = fee * discountPercent/100;
		int discountAmount = fee-discount ;
		System.out.println(String.format("The discount amount is INR %d and final discounted fee is INR %d",discount,discountAmount));
	}
}      
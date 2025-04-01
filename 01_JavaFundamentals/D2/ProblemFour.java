public class ProblemFour{
	public static void main(String[] args){
		int cp = 129;
		int sp = 191;
		int profit = sp-cp;
		int pp = (int)((double)profit/cp *100) ;
		System.out.println(String.format("The Cost Price is INR %d and Selling Price is INR %d \n The Profit is INR %d and the Profit Percentage is %d",cp,sp,profit,pp));
	}
}
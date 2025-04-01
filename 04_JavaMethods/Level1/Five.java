import java.util.Scanner ;
import java.lang.Math;
public class Five{
	public int posNegZero(int n){
		int res;
		if(n>=0){
			if(n==0){
				res=0;
			}else{
				res=1;
			}
		}else{
			res = -1;
		}
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("1 : Positive / 0:Negative / -1:Positive ");
		Five five = new Five();
		System.out.println(" Result : " +  five.posNegZero(num));
	}
}
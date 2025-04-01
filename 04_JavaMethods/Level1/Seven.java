import java.util.Scanner ;
import java.lang.Math;
public class Seven{
	public int sumOfFirstN(int n){
		int s=0;
		for(int i=1;i<=n;i++){
			s += i;
		}
		return s;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number : ");
		int n = sc.nextInt();
		Seven seven = new Seven();
		System.out.println("Sum of first " + n + "natural numbers is : " + seven.sumOfFirstN(n));
	}
}
import java.util.Scanner ;
import java.lang.Math;
public class Ten{
	public static int[] qAndR(int a ,int b){
		int[] res = new int[2];
		res[0] = a/b;
		res[1]=a%b;
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of chocolates : ");
		int a = sc.nextInt();
		System.out.println("Enter number of students: ");
		int b = sc.nextInt();
		int[] ans = Ten.qAndR(a,b);
		System.out.println("Each student will get chocolates of quantity : " + ans[0] +" Remaining Chocolates : " +ans[1]);
	}
}
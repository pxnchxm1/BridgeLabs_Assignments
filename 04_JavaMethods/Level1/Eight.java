import java.util.Scanner ;
import java.lang.Math;
public class Eight{
	public static int[] smallAndLarge(int a,int b,int c){
		int[] res = new int[2];
		if(a >= b && a>=c){
			res[1] = a;
			if(b>=c){
				res[0] = c;
			}else{
				res[0]=b;
			}
		} else if(b>=c && b>=a){
			res[1] = b;
			if(c>=a){
				res[0]=a;
			}else{
				res[0]=c;
			}
		}else{
			res[1]=c;
			if(a>=b){
				res[0]=b;
			}else{
				res[0]=a;
			}
		}
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a = sc.nextInt();
		System.out.println("Enter number 2: ");
		int b = sc.nextInt();
		System.out.println("Enter number 3: ");
		int c = sc.nextInt();
		int[] ans = Eight.smallAndLarge(a,b,c);
		System.out.println("Largest : " + ans[1] +" Smallest : " +ans[0]);
	}
}
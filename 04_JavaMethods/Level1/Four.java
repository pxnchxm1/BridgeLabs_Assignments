import java.util.Scanner ;
import java.lang.Math;
public class Four{
	public double rounds(int a , int b, int c){
		int distance = 5000; //5km
		int permiter = (a+b+c) ;
		int res = (int) Math.floor(distance/permiter);
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side a  : ");
		int a = sc.nextInt();
		System.out.println("Enter the side b  : ");
		int b = sc.nextInt();
		System.out.println("Enter the side c  : ");
		int c = sc.nextInt();
		Four four = new Four();
		System.out.println(" Number of Rounds   " +  four.rounds(a,b,c));
	}
}
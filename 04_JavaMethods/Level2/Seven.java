import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Seven{
	public static boolean canVote(int age){
		if(age>=18)return true; 
		return false;              // negative also false result
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i =0 ;i<10;i++){
			System.out.print("\nEnter age : ");
			System.out.println("Can the person vote ? " + Seven.canVote(sc.nextInt()));
		}
		
	}
}
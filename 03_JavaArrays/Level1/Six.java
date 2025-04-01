import java.util.Scanner;
public class Six{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] height = new double[11];
		double tot = 0.0;
		for(int h=0;h<11;h++){
			System.out.print("\nEnter the height of player " + (h+1) + " : " );
			height[h] = sc.nextDouble();
			tot += height[h];
		}
		System.out.println("Mean height of players in the team is : " + (tot/11));
		sc.close();
	}
}
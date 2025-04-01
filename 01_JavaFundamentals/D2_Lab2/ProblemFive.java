import java.util.Scanner;
public class ProblemFive{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit price");
		int up  = sc.nextInt();
		System.out.println("Enter quantity");
		int q = sc.nextInt();
		int tot= up*q;
		System.out.println(String.format(" The total purchase price is INR %d if the quantity %d and unit price is INR %d",tot,q,up));
		
		
	}
}
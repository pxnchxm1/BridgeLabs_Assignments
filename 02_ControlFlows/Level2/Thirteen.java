import java.util.Scanner;
public class Thirteen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		if(n > 100 | n < 0){
			System.out.println("Invalid number");
		}else{
			int counter = 100;
			while (counter!=1){
				if(n%counter==0){
					System.out.println(counter);
				}
				counter--;
			}
		}
		
		sc.close();
	}
}
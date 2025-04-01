import java.util.Scanner ;
public class Two{
	public int handshakes(int n){
		int res = (n * (n -1 )) / 2 ;
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people : ");
		int num = sc.nextInt();
		Two two = new Two();
		System.out.println("Maximum Number of Handshakes between   " + num + " people is : "+ two.handshakes(num));
	}
}
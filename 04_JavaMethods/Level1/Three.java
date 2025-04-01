import java.util.Scanner ;
public class Three{
	public int handshakes(int n){
		int res = (n * (n -1 )) / 2 ;
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people : ");
		int num = sc.nextInt();
		Three three = new Three();
		System.out.println("Maximum Number of Handshakes between   " + num + " people is : "+ three.handshakes(num));
	}
}
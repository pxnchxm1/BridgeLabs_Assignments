import java.util.Scanner;
public class Eight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :  ");
		int num = sc.nextInt();
		int n = num;
		int res = 0;
		while(n!=0){
			res += (n%10);
			n /= 10;
		}
		if(num%res == 0){
			System.out.println("Its harshad number");
		}else{
			System.out.println("Its not a harshad number");
		}
	
	}
}
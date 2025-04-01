import java.util.Scanner;
public class Four{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:  ");
		int n = sc.nextInt();
		boolean flag = true;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("Prime Number");
		}else{
			System.out.println("Not a Prime Number");
		}
		
		
	}
}
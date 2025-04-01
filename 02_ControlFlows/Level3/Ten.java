import java.util.Scanner;
public class Ten{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1:  ");
		int a = sc.nextInt();
		System.out.print("Enter the number 2:  ");
		int b = sc.nextInt();
		System.out.print("Enter operation (+,-,*,/) :  ");
		char op = sc.next().charAt(0);
		int res = 0;
		switch(op){
			case '+': res=a+b;
			         break;
			case '-' : res=a-b;
			         break;
			case '*' : res=a*b;
			         break;
			case '/' : res=a/b;
			         break;
			default : System.out.println("Invalid operation");
			         break;
		}
		System.out.println(res);
	
	}
}
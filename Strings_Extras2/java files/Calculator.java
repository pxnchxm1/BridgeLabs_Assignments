import java.util.Scanner;
public class Calculator{
	public static int add(int a,int b){
		return a+b;
	}
	public static int sub(int a,int b){
		return a-b;
	}
	public static int mul(int a,int b){
		return a*b;
	}
	public static int div(int a,int b){
		return a/b;
	}
	public static int mod(int a,int b){
		return a%b;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : " );
		int num1 =sc.nextInt();
		System.out.println("Enter num2 : " );
		int num2 =sc.nextInt();
		System.out.println("Enter your choice\n1 : addition\n2: Subtraction\n3 :Multiplication\n4: Division\n5: Modulus : ");
		int choice = sc.nextInt();
		
		if(choice<5){
			int res ;
			if(choice == 1){
			   res=add(num1,num2);
			}
			else if(choice == 2){
			   res = sub(num1,num2);
			}else if(choice == 3){
				res = mul(num1,num2);
			}else if(choice == 4){
				res = div(num1,num2);
			}else{
				res = mod(num1,num2);
			}
			System.out.println("result : " + res);
		}else{
			System.out.println("Invalid choice");
		}
		
		sc.close();
	
	}
}
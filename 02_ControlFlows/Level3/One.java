import java.util.Scanner;
public class One{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year above 1582 : ");
		int year = sc.nextInt();
		if(year>1582){
			if(year%400==0){
				System.out.println("Leap year");
			}else if(year%4==0 && year%100 != 0 ){
				System.out.println("Leap year");
			}else{
				System.out.println("Not Leap year");
			}
		}
		else{
			System.out.println("Invalid according to gregarian calander");
		}
	}
}
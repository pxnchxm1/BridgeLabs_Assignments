import java.util.Scanner;
public class Six{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tall = Integer.MIN_VALUE;
		int young = Integer.MAX_VALUE;
		String tallFriend = "" ;
		String youngFriend = "" ;
		for(int i=1;i<=3;i++){
			System.out.println("Enter age of friend "+ i);
			int age = sc.nextInt();
			if(age < young){
				young = age ;
				youngFriend = String.format("Friend %d",i);
			}
			System.out.println("Enter height of friend "+ i);
			int h = sc.nextInt();
			if(tall < h){
				tall = h;
				tallFriend = String.format("Friend %d",i);
			}
		}
		System.out.println("Tallest among 3 friends is "+ tallFriend + " and youngest is " + youngFriend);
	}
}
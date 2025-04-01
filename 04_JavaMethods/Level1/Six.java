import java.util.Scanner ;
import java.lang.Math;
public class Six{
	public boolean spring(int m,int d){
		boolean res=false;
		if( ( m>3 && m<6 ) || (m==3 && d>=20) || (m==6 &&d<=20)){
			res=true;
			
		}

		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month : ");
		int month = sc.nextInt();
		System.out.println("Enter the day : ");
		int day = sc.nextInt();
		Six six = new Six();
		String text = six.spring(month,day) ? "It is spring season " : "It is not a spring season ";
		System.out.println(text);
	}
}
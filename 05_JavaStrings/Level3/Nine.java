import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
import java.util.HashSet;
public class Nine{
	
	public static boolean isLeapYear(int n){
		if((n>1582 )&&((n%4==0 && n%100!=0) || (n%400==0))){
			return true;
		}
		return false;
	}
	public static int noOfDays(int m,int[] days){
		int noOfDaysInMonth = days[m-1];
		return noOfDaysInMonth;
	}
	public static String monthName(int m,String[] months){
        String monthN = months[m-1]	;	
		return monthN;
	}
	public static int firstDay(int y, int m,int d){
		int y0 = y - (14 - m) / 12 ;
        int x = y0 + y0/4 - y0/100 + y0/400 ;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/ 12) % 7 ;
		return d0;
	}
	public static void displayCalendar(int y,int m,int d,String mn, int f){
		System.out.println("  "+ mn + " "  + y);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		for(int i = 0 ; i<f;i++){
			System.out.print("    ");
		}
		for (int day = 1; day <= d; day++) {
            System.out.printf("%3d ", day);
            if ((f + day) % 7 == 0) {  
                System.out.println();
            }
        }
		System.out.println();
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month [1-12] : ");
		int month = sc.nextInt();
		System.out.println("Enter year (4digit) : ");
		int year = sc.nextInt();
		String[] months = {"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};	
		int[] days =  {31,28,31,30,31,30,31,31,30,31,30,31};
		if(Nine.isLeapYear(year)){
			days[1]=29;
		}
		String nameMonth = Nine.monthName(month,months);
		int numberOfDays = Nine.noOfDays(month,days);
		int firstDay = Nine.firstDay(year,month,numberOfDays);
		Nine.displayCalendar(year,month,numberOfDays,nameMonth,firstDay);
		
	}
	
}


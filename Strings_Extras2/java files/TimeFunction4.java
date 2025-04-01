import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

class TimeFunction4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	System.out.println("enter date 1  (dd-MM-yyyy) : ");
    String date1 = sc.nextLine(); 
	LocalDate d1 = LocalDate.parse(date1,f);
	System.out.println("enter date 2  (dd-MM-yyyy) : ");
    String date2 = sc.nextLine(); 
	LocalDate d2 = LocalDate.parse(date2,f);
	if(d1.isBefore(d2)){
		System.out.println(d1 + "is before " + d2);
	}else if(d1.isAfter(d2)){
		System.out.println(d2 + "is before " + d1);
	}else{
				System.out.println("Both are equal");
	}
    
	
	
  }
}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class TimeFunction3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    LocalDateTime today = LocalDateTime.now(); 
    DateTimeFormatter one = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter two = DateTimeFormatter.ofPattern("yyyy - MM - dd");
	DateTimeFormatter three = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
	System.out.println(today.format(one));
	System.out.println(today.format(two));
	System.out.println(today.format(three));
	
  }
}

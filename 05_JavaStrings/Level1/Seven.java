import java.util.Scanner;
public class Seven {
    public static int generateException(String s){
		return Integer.parseInt(s);
	}
	public static void handle(String s){
		try{
			int ans = generateException(s);
			System.out.println(ans);
		}catch (NumberFormatException e) {
            System.out.println("message : "+ e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        //System.out.println("number is : " + Seven.generateException(s));
		Seven.handle(s);
        sc.close();
    }
}

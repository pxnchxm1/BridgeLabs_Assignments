import java.util.Scanner;

public class Six {
    public static String generateException(String s){
		int start = s.length()-2;
		int end = 0;
		String ans = s.substring(start,end);
		return ans;
	}
	public static void handle(String s){
		try{
			String ans = generateException(s);
			System.out.println(ans);
		}catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        //Six.generateException(s);
		Six.handle(s);

        sc.close();
    }
}

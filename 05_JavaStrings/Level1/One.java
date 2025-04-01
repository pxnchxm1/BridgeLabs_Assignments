import java.util.Scanner;

class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = scanner.next();

        System.out.println("Enter the second string");
        String str2 = scanner.next();

        boolean compareCharAt = compare(str1, str2);
        boolean compareEquals = str1.equals(str2);

        if(compareCharAt){
            System.out.println("Characters are same");
        }else{
            System.out.println("Characters are not same");
        }
        if(compareEquals){
            System.out.println("String is equal");
        }else{
             System.out.println("String is not equal");
        }
    }
    public static boolean compare(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

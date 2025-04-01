import java.util.Scanner;

class Two {
     public static String substring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compare(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = scanner.next();
        System.out.println("Enter the start index");
        int start = scanner.nextInt();
        System.out.println("Enter the end index");
        int end = scanner.nextInt();
        String methodSubstring = substring(text, start , end);
        String builtInSubstring = text.substring(start, end);
        boolean compareSubstring = compare(methodSubstring, builtInSubstring);
        if(compareSubstring){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
   
}


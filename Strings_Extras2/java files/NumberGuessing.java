import java.util.Scanner;
public class NumberGuessing{
    public static int generateGuess(int low,int high){
		return ((int) (Math.random()*high + low));
	}
	public static void play(){
		Scanner sc = new Scanner(System.in);
		int low = 1;
		int high=100;
		System.out.println("Think a number between 1 to 100..ill guess it ");
		while(true){
			int g = generateGuess(low,high);
			System.out.println("Number is : " + g );
			System.out.println("Is number (correct/high/low) than your number ? ");
			String res = sc.next().trim().toLowerCase();
			if(res.equals("correct")){
				System.out.println("Yay");
				break;
			}else if(res.equals("high")){
				high = g-1;
				System.out.println("let me try again");
			}else if(res.equals("low")){
				
				low = g+1;
				System.out.println("let me try again");
			}else{
				System.out.println("Invalid choice!!! ");
			}
		}
		
		
	}
	public static void main(String[] args){
		play();
		
	
	}
}
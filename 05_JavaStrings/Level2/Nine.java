import java.util.Scanner;
import java.util.Arrays;
public class Nine{
    
    public static char winner(String c,String u){
		if((c.equals("paper") && u.equals("rock")) || (c.equals("rock") && u.equals("scissors")) || (c.equals("scissors") && u.equals("paper"))){
			return 'c';
		}else if((c.equals("paper") && u.equals("paper")) || (c.equals("rock") && u.equals("rock")) || (c.equals("scissors") && u.equals("scissors"))){

			return 't';
		}
		return 'u'; 
    }
	public static String compGen(){
		String[] choice = {"rock","paper","scissors"};
		int ch = (int) (Math.random()*3);
		return choice[ch];
	}
	public static String[][] calculateStats(int totalGames, int computerWins, int userWins) {
        double computerWinPercentage = ((double) computerWins / totalGames) * 100;
        double userWinPercentage = ((double) userWins / totalGames) * 100;
        String[][] stats = {
            {"Computer", String.valueOf(computerWins), String.format("%.2f%%", computerWinPercentage)},
            {"User", String.valueOf(userWins), String.format("%.2f%%", userWinPercentage)}
        };
        
        return stats;
    }

   
    public static void displayResults(int totalGames, int computerWins, int userWins) {
        System.out.println("\nFinal Results:");
        System.out.println("Computer score: " + computerWins);
        System.out.println("User score: " + userWins);

        if (computerWins > userWins) {
            System.out.println("Computer wins the game! ");
        } else if (userWins > computerWins) {
            System.out.println("User wins the game! ");
        } else {
            System.out.println("It's a Tie!");
        }

 
        String[][] stats = calculateStats(totalGames, computerWins, userWins);

   
        System.out.println("\nWin Statistics\n--------------------------------");
        System.out.printf("%-10s : %-5s : %-10s\n", "Player", "Wins", "Win %\n");
        for (String[] stat : stats) {
            System.out.printf("%-10s : %-5s :  %-10s\n", stat[0], stat[1], stat[2]);
        }
       
    }
	public static void play(int n){
		Scanner sc = new Scanner(System.in);
		int c=0;
			int u=0;
		for(int i=0;i<n;i++){
			System.out.print("\n Enter a choice  (rock,paper,scissors) : ");
			String user = sc.next().toLowerCase();
			String computer = compGen();
			System.out.println("computer choice : "+computer);
			char winner = winner(computer,user);
			
			if(winner=='c'){
				System.out.println("Computer wins round : "+ (i+1));
				c++;
			}
			else if(winner=='u'){
				System.out.println("User wins round : "+ (i+1));
				u++;
			}else{
				
				System.out.println("Tie on round : "+ (i+1));
			
			}
			
		}
	   
		displayResults(n, c, u);
		sc.close();
	}
	
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter number of rounds u wanna play ..... :) ");
	   int n = sc.nextInt();
	   play(n);
       

	   
    }
}
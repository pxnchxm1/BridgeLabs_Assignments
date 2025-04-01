import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class DeckOfCards{
	public static String[] initializeDeck(){
		String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
		String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int numOfCards = suits.length * ranks.length ;
		String[] deck = new String[numOfCards];
		int idx=0;
		for(int i=0;i<suits.length;i++){
			for(int j=0;j<ranks.length;j++){
				deck[idx++] = ranks[j] + " of " + suits[i] ;
			}
		}
		
		return deck;
	}
	public static String[] shuffleDeck(String[] deck){
		int n = deck.length;
		String[] shuffledDeck = deck;
		for(int i=0;i<n;i++){
			int r = i + (int) (Math.random() * (n - i));
			String temp = shuffledDeck[i];
			shuffledDeck[i]=shuffledDeck[r];
			shuffledDeck[r]=temp;

		}
		
		return shuffledDeck;
	}
	public static String[][] distributeCards(String[] deck, int x, int n) {
        if (x * n > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] players = new String[x][n];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }
	public static void printPlayers(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards: " + Arrays.toString(players[i]));
        }
    }

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] deck = initializeDeck();
		System.out.println("Created Decks :\n " + Arrays.toString(deck));
		String[] shuffled = shuffleDeck(deck);
		System.out.println("After Shuffling :\n " + Arrays.toString(shuffled));
		
		System.out.println("Enter number of players: ");
        int players = sc.nextInt();
        System.out.println("Enter number of cards per player: ");
        int cards = sc.nextInt();

        String[][] dist = distributeCards(deck, players, cards);
        printPlayers(dist);

        sc.close();
	}
	
}


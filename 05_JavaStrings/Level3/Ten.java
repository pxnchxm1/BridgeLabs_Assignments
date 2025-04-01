import java.util.Scanner ;
import java.lang.Math;
import java.util.Arrays;
public class Ten{
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
	public static String[] shuffleDeck(String[] d){
		
		String[] shuffledDeck = new String[numOfCards];
		for(int i=0;i<d.length;i++){
			int r = i + (int) (Math.random() * (numOfCards - i));
			String temp = d[i];
			d[i]=d[r];
			d[r]=temp;

		}
		
		return shuffledDeck;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] deck = initializeDeck();
		String[] shuffled = shuffleDeck(deck);
		System.out.println("Created Decks :\n " +Arrays.toString(deck));
		System.out.println("After Shuffling :\n " +Arrays.toString(deck));
	}
	
}


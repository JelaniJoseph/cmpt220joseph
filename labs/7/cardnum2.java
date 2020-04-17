public class cardnum2 {
    public static void main(String[] args) {

		class Card {
		    private int orank;
		    private int osuit;
		    public Card(int rank, int suit) {
		        orank = rank;
		        osuit = suit;
		    }
        }
        
		class Deck {
			private int onumCards;
			private Object[] ocards;
			public Deck(int numCards, Object[] cards) {
		        onumCards = numCards;
		        ocards = cards;
			}
			
		}
			// JA: Not the most efficient way
			Card aceOfClubs = new Card(1, 0);
			Card twoOfClubs = new Card(2, 0);
			Card threeOfClubs = new Card(3, 0);
			Card fourOfClubs = new Card(4, 0);
			Card fiveOfClubs = new Card(5, 0);
			Card sixOfClubs = new Card(6, 0);
			Card sevenOfClubs = new Card(7, 0);
			Card eightOfClubs = new Card(8, 0);
			Card nineOfClubs = new Card(9, 0);
			Card tenOfClubs = new Card(10, 0);
			Card jackOfClubs = new Card(11, 0);
			Card queenOfClubs = new Card(12, 0);
			Card kingOfClubs = new Card(13, 0);
			
			Card aceOfHearts = new Card(1, 1);
			Card twoOfHearts = new Card(2, 1);
			Card threeOfHearts = new Card(3, 1);
			Card fourOfHearts = new Card(4, 1);
			Card fiveOfHearts = new Card(5, 1);
			Card sixOfHearts = new Card(6, 1);
			Card sevenOfHearts = new Card(7, 1);
			Card eightOfHearts = new Card(8, 1);
			Card nineOfHearts = new Card(9, 1);
			Card tenOfHearts = new Card(10, 1);
			Card jackOfHearts = new Card(11, 1);
			Card queenOfHearts = new Card(12, 1);
			Card kingOfHearts = new Card(13, 1);
			
			Card aceOfDiamonds = new Card(1, 2);
			Card twoOfDiamonds = new Card(2, 2);
			Card threeOfDiamonds = new Card(3, 2);
			Card fourOfDiamonds = new Card(4, 2);
			Card fiveOfDiamonds = new Card(5, 2);
			Card sixOfDiamonds = new Card(6, 2);
			Card sevenOfDiamonds = new Card(7, 2);
			Card eightOfDiamonds = new Card(8, 2);
			Card nineOfDiamonds = new Card(9, 2);
			Card tenOfDiamonds = new Card(10, 2);
			Card jackOfDiamonds = new Card(11, 2);
			Card queenOfDiamonds = new Card(12, 2);
			Card kingOfDiamonds = new Card(13, 2);
			
			Card aceOfSpades = new Card(1, 3);
			Card twoOfSpades = new Card(2, 3);
			Card threeOfSpades = new Card(3, 3);
			Card fourOfSpades = new Card(4, 3);
			Card fiveOfSpades = new Card(5, 3);
			Card sixOfSpades = new Card(6, 3);
			Card sevenOfSpades = new Card(7, 3);
			Card eightOfSpades = new Card(8, 3);
			Card nineOfSpades = new Card(9, 3);
			Card tenOfSpades = new Card(10, 3);
			Card jackOfSpades = new Card(11, 3);
			Card queenOfSpades = new Card(12, 3);
			Card kingOfSpades = new Card(13, 3);
			
			
			Object[] allCards = {aceOfClubs,twoOfClubs,threeOfClubs,fourOfClubs,fiveOfClubs,sixOfClubs,sevenOfClubs,eightOfClubs,nineOfClubs,
					tenOfClubs,jackOfClubs,queenOfClubs,kingOfClubs,aceOfHearts,twoOfHearts,threeOfHearts,fourOfHearts,fiveOfHearts,sixOfHearts,
					sevenOfHearts,eightOfHearts,nineOfHearts,tenOfHearts,jackOfHearts,queenOfHearts,kingOfHearts,aceOfDiamonds,twoOfDiamonds,
					threeOfDiamonds,fourOfDiamonds,fiveOfDiamonds,sixOfDiamonds,sevenOfDiamonds,eightOfDiamonds,nineOfDiamonds,tenOfDiamonds,
					jackOfDiamonds,queenOfDiamonds,kingOfDiamonds,aceOfSpades,twoOfSpades,threeOfSpades,fourOfSpades,fiveOfSpades,sixOfSpades,
					sevenOfSpades,eightOfSpades,nineOfSpades,tenOfSpades,jackOfSpades,queenOfSpades,kingOfSpades};
			Deck standardDeck = new Deck(52, allCards);
		
}
}
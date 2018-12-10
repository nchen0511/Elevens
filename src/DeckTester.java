public class DeckTester {
    public static void main(String[] args){
        String[] suit = {"Hearts", "Diamonds", "Spades", "Ace"};
        String[] rank = {"1", "2", "3", "4"};
        int[] pointValue = {1,2,3,4};

        Deck testDeck = new Deck(suit,rank,pointValue);

        for(int i=0;i<testDeck.size();i++){
            System.out.println(testDeck.deal());
        }

    }
}

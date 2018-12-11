import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt = new ArrayList<>();
    private ArrayList<Card> Dealt = new ArrayList<>();

    public Deck(String[] suit, String[] rank, int[] pointValue){
        for(int i=0;i<suit.length;i++){
            for(int k=0;k<rank.length;k++) {
                Card temp = new Card(rank[k], suit[i], pointValue[k]);
                unDealt.add(temp);
            }
        }
    }

    public boolean isEmpty(){
        return unDealt.size()==0;
    }

    public int size(){
        return unDealt.size();
    }

    public Card deal(){
        if (unDealt.size() == 0) {
            return null;
        }
        Dealt.add(unDealt.get(unDealt.size()-1));
        unDealt.remove(unDealt.size()-1);
        return Dealt.get(Dealt.size()-1);
    }

    public void shuffle(){
        while(Dealt.size()>0){
            unDealt.add(Dealt.get(0));
            Dealt.remove(0);
        }

        for(int k=51;k>0;k--){
            int r = (int)(Math.random()*51);
            Card temp = unDealt.get(k);
            unDealt.set(k,unDealt.get(r));
            unDealt.set(r,temp);
        }
    }
}

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public Deck(String[] suit, String[] rank, int[] pointValue){
        for(int i=0;i<suit.length;i++){
            for(int k=0;k<rank.length;k++) {
                Card temp = new Card(rank[i], suit[k], pointValue[k]);
                System.out.println(temp);
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

    public void Shuffle(){
        for(int i=0;i<Dealt.size();i++){
            unDealt.add(Dealt.get(i));
            Dealt.remove(i);
        }

        for(int k=51;k>0;k++){
            int r = (int)Math.random()*51;
            Card temp = unDealt.get(k);
            unDealt.set(k,unDealt.get(r));
            unDealt.set(r,temp);
        }
    }
}

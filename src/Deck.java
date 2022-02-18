import java.util.*;

public abstract class Deck extends Pile{
    public Deck(){
        initDeck;
    }
    public void initDeck(){
        for (int s = 1; s < 5; s++) {
            for (int v = 2; v < 15; v++) {
                add(new Card(s,v));
            }
        }
    }
}

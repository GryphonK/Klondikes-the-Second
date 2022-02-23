import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class Deck extends Pile{
    public Deck(){
        initDeck();
    }
    public void initDeck(){
        for (int s = 1; s < 5; s++) {
            for (int v = 2; v < 15; v++) {
                add(new Card(s,v));
            }
        }
    }
    @Override
    public void draw(Graphics g) {
        
    }
    @Override
    public void update(ActionEvent a) {
        
    }
    @Override
    public boolean canAddCard(Card c) {
        return false;
    }
}

import java.awt.*;
import java.awt.event.ActionEvent;
public class Aces extends Pile {
    private Pile hearts, diamonds, clubs, spades;
    @Override
    public void draw(Graphics g){

    }
    @Override
    public void update(ActionEvent a){

    }
    @Override
    public boolean canAddCard(Card c) {
        return false;
    }

}

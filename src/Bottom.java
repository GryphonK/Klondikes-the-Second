import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class Bottom extends Pile{
    private Pile one, two, three, four, five, six, seven;

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

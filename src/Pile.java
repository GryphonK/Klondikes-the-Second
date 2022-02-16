

import java.awt.*;
import java.util.*;
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    
    public abstract boolean canAddCard(Card c);
    private ArrayList<Card> list = new ArrayList<>();
    private Point loc = new Point();
    public Point getLocation(){
        return loc;
    }
    public void setLocation(Point l) {
        loc = l;
    }
	public int size(){
        return list.size();
    }

    public void clear(){
        list.clear();
    }

	public void shuffle() {
        Collections.shuffle(list);   
	}

	public Card deal(){
		Card c = list.remove(0);
    return c;
	}

    public void addPile(Pile p){
        while(p.size()>0){
        this.add(p.deal());
        }
    }
  
  
	public void add(Card c) {
        list.add(c);
	}

	@Override
	public String toString(){
		String s = "";
    for (Card c : list) {
      s += "" + c;
      s += "\n";
    }
		return s;
	}
}

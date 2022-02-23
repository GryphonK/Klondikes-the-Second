import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class GameBoard implements Drawable, Updateable {
	
	private boolean firstClick = true;
	private Image testImage, backImage;
	//private Aces diamond, clubs, spades, hearts;
	private Bottom one, two, three, four, five, six, seven;
	private Deck deck;
	private Draw draw;
	private ArrayList<Point> clickableLoc = new ArrayList<>();
	public static final int OFFSET_X = 40, OFFSET_Y = 20, CARD_X=80, CARD_Y=100;

	
	 
	private int numdraws=0;
	
	
	
	public GameBoard() {
		deck.shuffle();
		one.add(deck.deal());
		for (int i = 0; i < 2; i++)
			two.add(deck.deal());
		for (int i = 0; i < 3; i++)
			three.add(deck.deal());
		for (int i = 0; i < 4; i++)
			four.add(deck.deal());
		for (int i = 0; i < 5; i++)
			five.add(deck.deal());
		for (int i = 0; i < 6; i++)
			six.add(deck.deal());
		for (int i = 0; i < 7; i++)
			seven.add(deck.deal());
		for (int i = 0; i < 3; i++)
			draw.add(deck.deal());
		try {
			testImage = ImageIO.read(new File("images/cards/dj.png"));
			backImage = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/** @param g Graphics context onto which all Objects in the game
	 * draw themselves.  This should NOT change the Objects
	 */
	public void draw(Graphics g) {
		numdraws++;
		g.setColor(new Color(40, 155, 70));
		g.fillRect(0, 0, 3000, 2000);
		
		// this is just to test drawing a card
		g.drawImage(testImage, 30, 80, null);
		g.drawImage(backImage, 100, 80, null);
		g.drawImage(backImage, 105, 100, null);
		//drawPiles(g);
	}



	/**
	 * This method is called by the game when a click has been made 
	 * on the panel.  Must determine if the click makes sense (is it 
	 * a valid location, If it is the first click, then note it and
	 * the next click will attempt a move (maybe).
	 * @param me
	 */
	public void justClicked(MouseEvent me) {
		Point p = me.getPoint();
		int type;
		for (int i=0; i<clickableLoc.size(); i++){
			Point pon = clickableLoc.get(i);
			if (pon.getX()-p.getX()<CARD_X){
				if(pon.getY()-p.getY()<CARD_Y){
					type=i;
				}

			}
		}

		if (firstClick){
			firstClick=false;
		}

	
		
		System.out.println("You just clicked "+p);


	}

	@Override
	// this update will be called each time the timer in the KlondikeGame
	// goes off.  This will be convenient for animating.
	public void update(ActionEvent a) {
		
		
	}

}

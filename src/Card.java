import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{

    private int suit, value;
    private int x,y;
    private boolean isUp;
    private Image img, faceDown;

    public Card(int suit, int value){
        this.suit = suit;
        this.value = value;
        x = 0;
        y = 0;
        isUp = false;
        faceDown = null;
        img = setImg();
    }
    
    public int getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean getIsUp(){
        return isUp;
    }

    public Image getImg(){
        if(isUp)
        return img;
        else
        return faceDown;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Image setImg(){
        String jqk = "";
        Image result = null;
        String imgName = "";
        if(suit == 1)
        imgName += "h";
        else if(suit == 2)
        imgName += "d";
        else if(suit == 3)
        imgName += "s";
        else
        imgName += "c";
        if (this.value == 11)
            jqk = "j";
        if (this.value == 12)
            jqk = "q";
        if (this.value == 13)
            jqk = "k";
        if (this.value <= 10)
            imgName += ""+value;
        else 
            imgName += ""+jqk;
        try {
			result = ImageIO.read(new File("images/cards/"+imgName+".png"));
            faceDown = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        return result;
    }

    public void flip(){
        if(isUp)
        isUp = false;
        else
        isUp = true;
    }

    public void draw(Graphics g){
        g.drawImage(img, x, y, null);
    }

    public void update(ActionEvent a) {
		//blank unless you want an animation
	}

}

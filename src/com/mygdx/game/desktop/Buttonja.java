package com.mygdx.game.desktop;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Buttonja {

    private Sprite skin; 

    public Buttonja(Texture texture, float x, float y, float width, float height) {
        skin = new Sprite(texture); // your image
        skin.setPosition(x, y);
        skin.setSize(width, height);
    }

    public void update (SpriteBatch batch, float input_x, float input_y) {
        checkIfClicked(input_x, input_y);
        skin.draw(batch); // draw the button
    }

    private void checkIfClicked (float ix, float iy) {
        if (ix > skin.getX() && ix < skin.getX() + skin.getWidth()) {
            if (iy > skin.getY() +  (skin.getHeight()*5)-10  && iy < skin.getY() +  (skin.getHeight()*6)-40 ) {
                // the button was clicked, perform an action
                
                if(ix <600)
                	Game.scene = 3;
                if(ix >600)
                	Game.scene = 2;
            }
        }
    }

}
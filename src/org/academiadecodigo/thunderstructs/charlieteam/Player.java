package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public class Player implements KeyboardHandler {
    private Picture player;
    private FieldPosition initPos;

    public Player(Picture picture){
        this.player = picture;
        picture.grow(-25,-25);
        draw();
    }

    public void draw(){
        this.player.draw();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT){
            player.translate(-40, 0);
            player.draw();
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT){
            player.translate(40,0);
            player.draw();
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

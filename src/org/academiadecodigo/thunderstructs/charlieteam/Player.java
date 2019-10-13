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
    private boolean keyLeft = false;
    private boolean keyRight = false;

    public Player(Picture picture) {
        this.player = picture;
        picture.grow(-25, -25);
        draw();
    }

    public void draw() {
        this.player.draw();
    }

    public void playerMove() {
        if (keyRight) {
            player.translate(10, 0);
            player.draw();
        }
        if (keyLeft) {
            player.translate(-10, 0);
            player.draw();
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            setKeyLeft(true);
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            setKeyRight(true);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            setKeyLeft(false);
        }
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT){
            setKeyRight(false);
        }
    }

    public void setKeyLeft(boolean keyLeft) {
        this.keyLeft = keyLeft;
    }

    public void setKeyRight(boolean keyRight) {
        this.keyRight = keyRight;
    }
}

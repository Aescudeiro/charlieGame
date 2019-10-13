package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public class Player implements KeyboardHandler {

    private Field field;
    private Picture playerPicture;
    private FieldPosition pos;
    private int x;
    private int y;
    private int width = 50;
    private int height = 50;


    public Player(Field field, FieldPosition pos) {
        this.field = field;
        this.pos = pos;
        this.playerPicture = new Picture(pos.getX(), pos.getY(), "spr_player.png");

        playerPicture.grow(-25, -25);
        pos.setPicture(playerPicture);
        draw();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void draw() {
        this.playerPicture.draw();
    }

    public void moveLeft()  {
            this.playerPicture.translate(-10, 0);
            playerPicture.draw();

        }

    public void moveRight() {
            this.playerPicture.translate(10, 0);
            playerPicture.draw();
        }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_LEFT:
                    moveLeft();
                break;

            case KeyboardEvent.KEY_RIGHT:
                    moveRight();
                break;

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {



    }


}

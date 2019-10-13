package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public class Player implements KeyboardHandler {

    private Field field;
    private Picture playerPicture ;
    private FieldPosition pos;
    private int x;
    private int y;
    private int width = 50;
    private int height = 50;

    public Player(Field field, FieldPosition pos){
        this.field = field;
        this.pos = pos;
        this.playerPicture = new Picture(pos.getX(), pos.getY(), "spr_player.png");

        pos.setPicture(playerPicture);
        playerPicture.grow(25,25);
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

    public void draw(){
        this.playerPicture.draw();
    }

    public int playerMaxX(){
        return playerPicture.getMaxX();
    }

    public int playerMaxY(){
        return playerPicture.getMaxY();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            if (pos.getX() > 40) {
                playerPicture.translate(-10, 0);
                pos.setX(-10);
                System.out.println(pos.getX());
                playerPicture.draw();
            }
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            if (pos.getX() < field.getWidth() - 70) {
                playerPicture.translate(10, 0);
                pos.setX(10);
                System.out.println(pos.getX());
                playerPicture.draw();
            }
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {

        }


    }




}

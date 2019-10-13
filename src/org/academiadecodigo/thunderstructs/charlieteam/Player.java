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

        playerPicture.grow(-25,-25);
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

    public void draw(){
        this.playerPicture.draw();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT){
            if(pos.getX() > -10){
            playerPicture.translate(-10, 0);
            pos.setX(-10);
            System.out.println(pos.getX());
            playerPicture.draw();}
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT){
            if(pos.getX() < field.getWidth() - 20 - playerPicture.getWidth()){
            playerPicture.translate(10,0);
            pos.setX(10);
            System.out.println(pos.getX());
            playerPicture.draw();}
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT){

        }


    }




}

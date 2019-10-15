package org.academiadecodigo.thunderstructs.charlieteam.field;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class FieldPosition {
    private int x;
    private int y;
    private Picture picture;
    private int width = 50;
    private int height = 50;
    private Field field;

    public FieldPosition(int x, int y, Field field){
        this.x = x;
        this.y = y;
        this.field = field;
    }

    public void show(){
        this.picture.draw();
    }

    public void hide(){
        this.picture.delete();
    }

    public void setX(int x) {
        this.x += x;
    }

    public void setY(int y) {
        this.y += y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setPicture(Picture picture){
        this.picture = picture;
    }

}

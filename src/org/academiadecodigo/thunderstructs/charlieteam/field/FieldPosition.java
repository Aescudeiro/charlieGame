package org.academiadecodigo.thunderstructs.charlieteam.field;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class FieldPosition {
    private int col;
    private int row;
    private Picture picture;
    private Field field;

    public FieldPosition(int col, int row, Field field){
        this.col = col;
        this.row = row;
        this.field = field;
        show();
    }

    public void show(){
        this.picture.draw();
    }

    public void hide(){
        this.picture.delete();
    }

    public void move(){

    }

    public void setPicture(Picture picture){
        this.picture = picture;
    }

}

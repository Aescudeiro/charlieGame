package org.academiadecodigo.thunderstructs.charlieteam.field;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Field {

    private Rectangle field;
    private int padding = 10;
    private int cellSize = 50;
    private int width;
    private int height;

    public Field(int width, int height){
        Rectangle field = new Rectangle(padding,padding, width, height);
        this.width = width;
        this.height = height;
        this.field = field;
        init();
    }

    public void init(){
        field.draw();
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
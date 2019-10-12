package org.academiadecodigo.thunderstructs.charlieteam.field;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Field {

    private Rectangle field;
    private int padding = 10;
    private int cols;
    private int rows;
    private int cellSize = 50;

    public Field(int width, int height){
        Rectangle field = new Rectangle(padding,padding, width, height);
        this.field = field;
        this.rows = field.getHeight() / this.cellSize;
        this.cols = field.getWidth() / this.cellSize;
        init();
    }

    public void init(){
        field.draw();
    }

    public int getCols(){
        return this.cols;
    }

    public int getRows(){
        return this.rows;
    }

    public int getCellSize() {
        return cellSize;
    }

    public FieldPosition makeFieldPos(int col, int row){
        return new FieldPosition(col,row,this);
    }
}
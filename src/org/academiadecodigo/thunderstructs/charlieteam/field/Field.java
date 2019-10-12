package org.academiadecodigo.thunderstructs.charlieteam.field;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {

    private Picture field;
    private int cols;
    private int rows;
    private int cellSize;

    public void init(){

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
        return new FieldPosition(col,row,this.field);
    }
}
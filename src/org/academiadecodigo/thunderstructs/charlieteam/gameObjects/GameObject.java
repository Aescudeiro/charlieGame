package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.Game;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public abstract class GameObject {

    private Picture picture;
    private Field field;
    private FieldPosition fieldPos;
    private int row;
    private int col;

    public GameObject(){}

    public GameObject(Field field,FieldPosition pos){
        this.field = field;
        this.fieldPos = pos;
    }

    public void fall(){
        picture.translate(0,100);
        picture.translate(0,100);
        picture.translate(0,100);


    }



    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Picture getPicture() {
        return picture;
    }

    public Field getField() {
        return field;
    }

    public FieldPosition getFieldPos() {
        return fieldPos;
    }
}

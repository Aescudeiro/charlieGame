package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public abstract class GameObject {

    private Picture picture;
    private Field field;
    private FieldPosition fieldPos;
    private int x;
    private int y;
    private int score;


    public GameObject(Field field,FieldPosition pos){
        this.field = field;
        this.fieldPos = pos;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Picture getPicture() {
        return picture;
    }

    public FieldPosition getFieldPos() {
        return fieldPos;
    }

    public int getScore() {
        return score;
    }
}

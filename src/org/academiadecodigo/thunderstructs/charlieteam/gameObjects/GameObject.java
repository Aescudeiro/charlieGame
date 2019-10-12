package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public abstract class GameObject {

    private Picture picture;
    private Field field;
    private FieldPosition fieldPos;

    public GameObject(){}

    public GameObject(Field field,FieldPosition pos){

    }

    public void fall(){

    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
}

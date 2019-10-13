package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public abstract class GameObject {

    private Picture picture;
    private Field field;
    private FieldPosition fieldPos;


    public GameObject(Field field,FieldPosition pos){
        this.field = field;
        this.fieldPos = pos;
    }


    public void fall() throws InterruptedException {
        while(fieldPos.getY() < field.getHeight() - picture.getHeight() - 20){
        picture.translate(0,1);
        fieldPos.setY(1);
        Thread.sleep(2);
        }

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

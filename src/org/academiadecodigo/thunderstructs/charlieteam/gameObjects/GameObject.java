package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.Game;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public abstract class GameObject {

    private Picture picture;
    private Field field;
    private FieldPosition fieldPos;


    public GameObject(){}

    public GameObject(Field field,FieldPosition pos){
        this.field = field;
        this.fieldPos = pos;
    }


    public void fall() throws InterruptedException {
        while(fieldPos.getRow() < 735){
        picture.translate(0,1);
        fieldPos.setRow(1);
            Thread.sleep(5);
            /*picture.translate(0,50);
        Thread.sleep(200);
        picture.translate(0,50);
        Thread.sleep(200);
        picture.translate(0,50);
        Thread.sleep(200);
        picture.translate(0,50);
        Thread.sleep(200);
        picture.translate(0,50);
        Thread.sleep(200);
        picture.translate(0,50);*/
        }
        fieldPos.hide();

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

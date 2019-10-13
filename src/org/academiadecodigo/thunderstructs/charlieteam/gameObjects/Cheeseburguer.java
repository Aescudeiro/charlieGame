package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public class Cheeseburguer extends GameObject {

    // private Picture picture = new Picture(getFieldPos().getX(),getFieldPos().getY(), "spr_burguer.png");


    public Cheeseburguer(Field field, FieldPosition pos){
       super(field , pos);
       setPicture(new Picture(getFieldPos().getX(), getFieldPos().getY(), "spr_burguer.png"));

    }
}

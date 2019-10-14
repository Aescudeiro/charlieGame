package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public class Apple extends GameObject{

    public Apple (Fiegild field, FieldPosition pos){
        super(field , pos);
        setPicture(new Picture(getFieldPos().getX(), getFieldPos().getY(), "spr_burguer.png"));

    }
}

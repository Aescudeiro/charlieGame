package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public class Salad extends GameObject {

        public Salad (Field field, FieldPosition pos){
            super(field , pos);
            setPicture(new Picture(getFieldPos().getX(), getFieldPos().getY(), "spr_lettuce.png"));

        }
}

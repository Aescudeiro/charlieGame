package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

import javax.swing.text.Position;

public class Cheeseburguer extends GameObject {

    public Cheeseburguer(){}

    public Cheeseburguer(Field field, FieldPosition pos){
       super(field , pos);

       Picture picture = new Picture(getFieldPos().getCol(),getFieldPos().getRow(), "spr_burguer.png");

       super.setPicture(picture);

       super.getFieldPos().setPicture(getPicture());

    }
}

package org.academiadecodigo.thunderstructs.charlieteam.gameObjects;

import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;

public class ObjectFactory {

    private Field field;

    public ObjectFactory(Field field) {
        this.field  = field;
    }

    public GameObject createObject(int multi, int pos) {


        int objectRandom = (int) (Math.random() * multi);
        GameObject object;
        switch (objectRandom) {
            case 0:
                object = new Cheeseburguer(field, new FieldPosition(pos , 30, field));
                break;
            case 1:
                object = new Apple(field, new FieldPosition(pos, 30, field));
                break;
            case 2:
                object = new Salad(field, new FieldPosition(pos, 30, field));
                break;
            default:
                object = new Cheeseburguer(field, new FieldPosition(pos, 30, field));
                break;
        }

        return object;
    }
}

package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.field.FieldPosition;
import org.academiadecodigo.thunderstructs.charlieteam.gameObjects.Cheeseburguer;
import org.academiadecodigo.thunderstructs.charlieteam.gameObjects.GameObject;

public class Game {
    private Field field;
    private Player player;
    private int points;
    private GameObject object;

    public void init() {
        createField();
        Picture background = new Picture(10,10,"spr_background.png");
        background.draw();
        createPlayer();
        menu();

    }

    public void start() throws InterruptedException {
        while (points < 10) {
            object = new Cheeseburguer(field, new FieldPosition(randomPos(), -10, field));

            object.getFieldPos().setPicture(object.getPicture());
            object.getFieldPos().show();
            object.fall();
            object.getFieldPos().hide();
            continue;
        }

    }

    public Field createField() {
        this.field = new Field(500, 800);
        return field;
    }

    public Player createPlayer() {

        this.player = new Player(field, new FieldPosition(225, 735, field));

        Keyboard keyboard = new Keyboard(player);


        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);



        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);



        keyboard.addEventListener(leftPressed);
        keyboard.addEventListener(rightPressed);

        return player;
    }



    public int randomPos() {
        return (int) (Math.random() * 400);
    }

public void menu(){
    Menu menu = new Menu();
    Keyboard keyboard = new Keyboard(menu);

    KeyboardEvent space = new KeyboardEvent();
    space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
    space.setKey(KeyboardEvent.KEY_SPACE);

    keyboard.addEventListener(space);

    menu.menu();
}
}



package org.academiadecodigo.thunderstructs.charlieteam;

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
        Picture background = new Picture(10, 10, "spr_background.png");
        background.draw();
        createPlayer();
    }

    public void start() throws InterruptedException {
        while (points < 10) {
            object = new Cheeseburguer(field, new FieldPosition(randomPos(), -10, field));

            object.getFieldPos().setPicture(object.getPicture());
            object.getFieldPos().show();
            while (object.getFieldPos().getY() < field.getHeight() - object.getPicture().getHeight()) {
                object.getPicture().translate(0, 1);
                object.getFieldPos().setY(1);
                collision();
                Thread.sleep(2);

            }
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

        KeyboardEvent left = new KeyboardEvent();
        player.keyPressed(left);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(left);

        KeyboardEvent right = new KeyboardEvent();
        player.keyPressed(right);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(right);
        return player;
    }


    public int randomPos() {
        return (int) (Math.random() * 400);
    }

    public void collision() {

    }

}

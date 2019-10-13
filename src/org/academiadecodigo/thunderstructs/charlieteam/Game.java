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
    private boolean win;

    private GameObject object;

    public void init() {
        createField();
        Picture background = new Picture(10,10,"spr_background.png");
        background.draw();
        createPlayer();
    }

    public void start() throws InterruptedException {
        while (!win) {
            object = new Cheeseburguer(field, new FieldPosition(randomPos(), -10, field));

            object.getFieldPos().setPicture(object.getPicture());
            object.getFieldPos().show();
            object.fall();
            player.playerMove();
            continue;
        }

    }

    public Field createField() {
        this.field = new Field(500, 800);
        return field;
    }

    public Player createPlayer() {
        Picture picture = new Picture(225, 735, "spr_player.png");
        this.player = new Player(picture);

        Keyboard keyboard = new Keyboard(player);

        KeyboardEvent left = new KeyboardEvent();
        KeyboardEvent leftRelease = new KeyboardEvent();
        KeyboardEvent right = new KeyboardEvent();
        KeyboardEvent rightRelease = new KeyboardEvent();

        player.keyPressed(left);
        player.keyReleased(leftRelease);
        player.keyPressed(right);
        player.keyReleased(rightRelease);

        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        leftRelease.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        rightRelease.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        left.setKey(KeyboardEvent.KEY_LEFT);
        leftRelease.setKey(KeyboardEvent.KEY_LEFT);

        right.setKey(KeyboardEvent.KEY_RIGHT);
        rightRelease.setKey(KeyboardEvent.KEY_RIGHT);

        keyboard.addEventListener(left);
        keyboard.addEventListener(leftRelease);
        keyboard.addEventListener(right);
        keyboard.addEventListener(rightRelease);

        return player;
    }


    public int randomPos() {
        return (int) (Math.random() * 400);
    }


}

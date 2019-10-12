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
    private GameObject[] gameObjects;
    private Player player;

    public void init() {
        createField();
        createPlayer();
        createGameObjects();
    }

    public void start() {
        for(GameObject object : gameObjects){
            object.getFieldPos().show();
            //object.fall();
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

    public void createGameObjects() {
        gameObjects = new GameObject[10];
        for (int i = 0; i < gameObjects.length; i++) {
            int random = randomPos();
            gameObjects[i] = new Cheeseburguer(field, new FieldPosition(random, 0, field));
            gameObjects[i].getFieldPos().setPicture(gameObjects[i].getPicture());
        }
    }

    public int randomPos() {
        return (int) Math.random() * (5-1) + 1;
    }


}

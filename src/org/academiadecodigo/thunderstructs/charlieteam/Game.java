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
        createPlayer();
    }

    public void start() throws InterruptedException {
        while(points < 10){
        /*for(GameObject object : gameObjects){
            object

            object.getFieldPos().show();
            object.fall();*/
            System.out.println(randomPos());
        object = new Cheeseburguer(field, new FieldPosition(randomPos(),-50,field));

        object.getFieldPos().setPicture(object.getPicture());
        object.getFieldPos().show();
        object.fall();
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

        /*for (int i = 0; i < gameObjects.length; i++) {
            int random = randomPos();
            gameObjects[i] = new Cheeseburguer(field, new FieldPosition(random, 0, field));
            gameObjects[i].getFieldPos().setPicture(gameObjects[i].getPicture());
        }*/
    }

    public int randomPos() {
        return (int) (Math.random() * 450);
    }


}

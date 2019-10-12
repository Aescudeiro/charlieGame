package org.academiadecodigo.thunderstructs.charlieteam;

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



    }

    public Field createField() {
        this.field = new Field(500, 800);
        return field;
    }

    public Player createPlayer() {
        Picture picture = new Picture(100, 100, "spr_player.png");
        this.player = new Player(picture);
        return player;
    }

    public void createGameObjects() {
        gameObjects = new GameObject[10];
        for (int i = 0; i < gameObjects.length; i++) {
            int random = randomPos();
            gameObjects[i] = new Cheeseburguer(field, new FieldPosition(random, 0, field));
        }
    }

    public int randomPos() {
        return (int) Math.random() * (5-1) + 1;
    }


}


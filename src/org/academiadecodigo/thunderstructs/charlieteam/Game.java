package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.gameObjects.GameObject;

public class Game {
    private Field field;
    private GameObject[] gameObjects;
    private Player player;

    public void init(){
        createField();
        createPlayer();
    }

    public void start(){

    }

    public Field createField(){
        this.field = new Field(500,800);
        return field;
    }

    public Player createPlayer() {
        Picture picture = new Picture(100,100,"spr_player.png");
        this.player = new Player(picture);
        return player;
    }

    public GameObject[] createGameObjects() {
        return gameObjects;
    }

    public int randomPos(){
        return 0;
    }


}

package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.thunderstructs.charlieteam.field.Field;
import org.academiadecodigo.thunderstructs.charlieteam.gameObjects.GameObject;

public class Game {

    private Field field;
    private GameObject[] gameObjects;
    private Player player;

    public void init(){
        createField(500,600,100);
    }

    public void start(){

    }

    public Field createField(int width, int height, int cellsize){
        return field;
    }

    public Player getPlayer(Picture picture) {
        return player;
    }

    public GameObject[] getGameObjects() {
        return gameObjects;
    }

    public int randomPos(){
        return 0;
    }


}

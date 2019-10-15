package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class LevelUp implements KeyboardHandler {
    private boolean enter = false;

    public void levelUp(){

        Picture levelUp = new Picture(10,10, "spr_levelUp.png");
        levelUp.draw();
        while (!enter){
            levelUp.draw();
        }
        levelUp.delete();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_SPACE:
                this.enter = true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
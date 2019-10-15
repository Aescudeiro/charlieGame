package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameOver implements KeyboardHandler {
    private boolean enter = false;

    public void gameOver(){

        Picture over = new Picture(10, 10 ,"spr_gameover.png");
            over.draw();
        while (!enter){
            over.draw();
        }
        over.delete();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_R:
                this.enter = true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

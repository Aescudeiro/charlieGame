package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Win implements KeyboardHandler {

    private boolean r = false;

    public void win(){

        Picture win = new Picture(10, 10 ,"spr_win.png");
        win.draw();
        while (!r){
            win.draw();
        }

        win.delete();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_R){
            this.r = true;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_R){
            this.r = false;
        }
    }
}

package org.academiadecodigo.thunderstructs.charlieteam;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Menu implements KeyboardHandler {

private boolean space = false;

    public void menu(){

        Text welcome = new Text(250,300,"Welcome to game");
        welcome.grow(100,50);
        while (!space){
            welcome.draw();
        }
        welcome.delete();

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_SPACE:
                this.space = true;
                break;
        }


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

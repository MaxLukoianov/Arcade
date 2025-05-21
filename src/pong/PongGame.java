package pong;

import arcade.Game;
import javax.swing.*;

public class PongGame extends Game {

    GameFrame frame;

    @Override
    public void start() {
        frame = new GameFrame();
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    public void updateGameState() {
    }
    @Override
    public void exit() {
    }

    //@Override
    //public JPanel getSettingsPanel() {
    //    return new PongSettings().getPanel(); // Optional settings
    //}
}

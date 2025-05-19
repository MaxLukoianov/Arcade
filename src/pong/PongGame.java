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
        frame.pause();// Optional: Implement pause logic (e.g., freeze thread)
    }

    @Override
    public void resume() {
        frame.resume();// Optional: Implement resume logic
    }

    public void updateGameState() {
        // Update the game state (e.g., move paddles, update ball position)
    }
    @Override
    public void exit() {
        frame.dispose();
    }

    //@Override
    //public JPanel getSettingsPanel() {
    //    return new PongSettings().getPanel(); // Optional settings
    //}
}

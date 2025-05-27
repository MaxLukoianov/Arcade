package pong;

import arcade.Game;

public class PongGame extends Game {

    GameFrame frame;

    @Override
    public void start() {
        frame = new GameFrame();
    }

    //@Override
    //public JPanel getSettingsPanel() {
    //    return new PongSettings().getPanel(); // Optional settings
    //}
}

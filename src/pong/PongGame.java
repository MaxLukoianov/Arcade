package pong;

import arcade.Game;
import pong.GameFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import pong.Ball;
import pong.Score;
import pong.Paddle;



public class PongGame extends Game {

    GameFrame frame;
    public void start() {
        if (GameFrame.returnHasOpened()) {
            frame = new GameFrame();
        }
    }
}

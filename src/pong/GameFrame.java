package pong;

import javax.swing.JFrame;
import arcade.Game;

public class GameFrame extends JFrame {
    private PongGame game;
    private static boolean isPaused = false;

    public static boolean getIsPaused() {
        return isPaused;
    }
    public static void pause() {
        isPaused = true;
    }

    public static void resume() {
        isPaused = false;
    }

    public void exit() {
        
    }
    GamePanel panel;

    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

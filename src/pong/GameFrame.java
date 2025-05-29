package pong;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import arcade.Game;
import javax.swing.JLayer;

public class GameFrame extends JFrame {
    public static GameFrame instance;
    private PongBlurLayerUI blurLayerUI;
    private JLayer<GamePanel> jlayer;
    private static boolean isPaused = false;
    private volatile boolean running = true;
    private static boolean hasOpened = false;

    public static boolean getIsPaused() {
        return isPaused;
    }
     public static void pause() {
         isPaused = true;
        if (instance !=null){
            instance.blurLayerUI.setPaused(true);
            instance.jlayer.repaint();
         }
        
     }

     public static void resume() {
        isPaused = false;
        if (instance != null){
            instance.blurLayerUI.setPaused(false);
            instance.jlayer.repaint();
        }
     }
    GamePanel panel;

    public GameFrame() {
        resume();
        instance = this;
        panel = new GamePanel();
        
        blurLayerUI = new PongBlurLayerUI();

        jlayer = new JLayer<GamePanel>(panel, blurLayerUI);
        this.add(jlayer);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
    public void stop()
    {
        running = false;
    }
    public boolean getIsRunning()
    {
        return running;
    }
    public static boolean returnHasOpened() {
        return hasOpened;
    }
    public static void flipHasOpened() {
        hasOpened = !hasOpened;
    }
    
}

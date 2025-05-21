package pong;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import arcade.Game;
import javax.swing.JLayer;

public class GameFrame extends JFrame {
    public static GameFrame instance;
    private BlurLayerUI blurLayerUI;
    private JLayer<GamePanel> jlayer;
    private static boolean isPaused = false;

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
        instance = this;
        panel = new GamePanel();
        
        blurLayerUI = new BlurLayerUI();

        jlayer = new JLayer<GamePanel>(panel, blurLayerUI);
        this.add(jlayer);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
    public void exit() {
       this.dispose();
    }
}

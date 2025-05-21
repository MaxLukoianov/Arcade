package chess;

import arcade.Game;
import java.awt.Color;
import pong.GameFrame;
import java.awt.GridBagLayout;
import java.awt.Dimension;

import javax.swing.*;

public class ChessGame extends Game{
    private static boolean isPaused = false;
    
    public static void launchChess() {
        JFrame frame = new JFrame("Chess Game");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(680, 700));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // closes only this window

        Board board = new Board();
        frame.add(board);
        
        frame.pack();
        frame.setVisible(true);
        
    }
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

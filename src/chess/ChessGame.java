package chess;

import arcade.Game;
import java.awt.Color;
import arcade.ArcadeFrame;
import pong.PongBlurLayerUI;
import pong.GameFrame;
import java.awt.GridBagLayout;
import java.awt.RenderingHints.Key;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.awt.Font;
import java.io.File;
import javax.swing.JLayer;
import javax.swing.JFrame;


public class ChessGame extends Game {
    private static boolean isPaused = false;
    private static ChessGame chessGame = new ChessGame();
    private static chess.ChessGame instance = ArcadeFrame.getChessGame();
    private ChessBlurLayerUI blurLayerUI;
    private static JLayer<GamePanel> j1layer;
    private static JFrame frame;
    GamePanel panel;

    public ChessGame() {
        instance = this;
        panel = new GamePanel();
        blurLayerUI = new ChessBlurLayerUI();
        j1layer = new JLayer<GamePanel>(panel, blurLayerUI);
        //this.add(j1layer);
    }
    public static void launchChess(ChessGame game) {
        frame = new JFrame("Chess Game");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(680, 700));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // closes only this window
        Board board = new Board();
        frame.add(board);
        //frame.add(j1layer);
        board.repaint();
        frame.pack();
        frame.setVisible(true);
        frame.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                frame.dispose();
            }
            // if (e.getKeyCode() == KeyEvent.VK_P){
            //     System.out.println("pressed");
            //     if (getIsPaused()) {
            //         System.out.println("resumed");
            //         game.resume();
            //     } else {
            //         System.out.println("paused");
            //         game.pause();
            //     }
            // }
        }
        });
    }


    public static boolean getIsPaused() {
            return isPaused;
        }
     public void pause() {
        isPaused = true;
        if (instance !=null){
            instance.blurLayerUI.setPaused(true);
            instance.j1layer.repaint();
         }
        
     }

     public void resume() {
        isPaused = false;
        if (instance != null){
            instance.blurLayerUI.setPaused(false);
            instance.j1layer.repaint();
        }
     }

     public void start() {

     }
    public void updateGameState() {
    }

    public void exit() {
        frame.dispose();
    }

    //@Override
    //public JPanel getSettingsPanel() {
    //    return new PongSettings().getPanel(); // Optional settings
    //}
}

package arcade;

import javax.swing.JFrame;
import javax.swing.JPanel;
import pong.GamePanel; 
import pong.PongGame;
import chess.ChessGame;

import java.awt.CardLayout;

import java.awt.Font;
import java.io.File;

public class ArcadeFrame extends JFrame {

    CardLayout cardLayout;
    JPanel mainPanel;
    private static ChessGame chessGame;

    public ArcadeFrame() {
        this.setTitle("Java Arcade");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Add screens
        mainPanel.add(new MenuPanel(this), "menu");
        mainPanel.add(new pong.GamePanel(), "pong");
        mainPanel.add(new chess.GamePanel(), "chess");

        this.add(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void showScreen(String name) {
        Game pong = new PongGame();
        chessGame = new ChessGame();
         if (name.equals("pong")) {
             pong.start();
         }
        if (name.equals("chess")) {
            chessGame.start();
            chess.ChessGame.launchChess(chessGame);
            //System.out.println("chess started");
        }
    }
    public static ChessGame getChessGame() {
        return chessGame;
    }

}

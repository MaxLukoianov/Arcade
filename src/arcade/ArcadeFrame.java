package arcade;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JSlider;
import pong.GamePanel; 
import pong.PongGame;
import chess.ChessGame;
import minesweeper.Minesweeper;

import java.awt.CardLayout;

import java.awt.Font;
import java.io.File;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ArcadeFrame extends JFrame {

    CardLayout cardLayout;
    JPanel mainPanel;
    private static ChessGame chessGame;
    Game pong;
    Minesweeper minesweeper;

    public ArcadeFrame() {
        pong = new PongGame();
        chessGame = new ChessGame();

        this.setTitle("Java Arcade");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Add screens
        mainPanel.add(new MenuPanel(this), "menu");
        mainPanel.add(new pong.GamePanel(), "pong");
        mainPanel.add(new chess.GamePanel(), "chess");
        
        this.add(mainPanel, BorderLayout.CENTER);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void showScreen(String name) {
        // pong = new PongGame();
        // chessGame = new ChessGame();
         if (name.equals("pong")) {
            pong.start();
         }
        if (name.equals("chess")) {
            chess.ChessGame.launchChess(chessGame);
            //System.out.println("chess started");
        }
        if (name.equals("minesweeper")) {
            minesweeper = new Minesweeper();
        }

    }
    public static ChessGame getChessGame() {
        return chessGame;
    }
}

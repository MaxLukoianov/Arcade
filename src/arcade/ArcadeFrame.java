package arcade;

import javax.swing.*;
import pong.GamePanel; 
import pong.PongGame;
import chess.ChessGame;

import java.awt.*;

public class ArcadeFrame extends JFrame {

    CardLayout cardLayout;
    JPanel mainPanel;

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
        Game chess = new ChessGame();
         if (name.equals("pong")) {
             pong.start();
         }
        if (name.equals("chess")) {
            chess.start();
            System.out.println("chess started");
        }

    }
}

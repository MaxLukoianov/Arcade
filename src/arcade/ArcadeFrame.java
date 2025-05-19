package arcade;

import javax.swing.*;
import pong.GamePanel; 
import pong.PongGame;

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
        mainPanel.add(new GamePanel(), "pong");

        this.add(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void showScreen(String name) {
        Game game = new PongGame();
        game.start();
    }
}

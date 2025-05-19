//****** MenuPanel.java
package arcade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import pong.GamePanel;

public class MenuPanel extends JPanel {

    public MenuPanel(ArcadeFrame frame) {
        this.setPreferredSize(new Dimension(1000, 555));
        this.setLayout(null); // absolute positioning

        JButton pongButton = new JButton("Play Pong");
        pongButton.setBounds(400, 200, 200, 50);
        pongButton.addActionListener(e -> {
            frame.showScreen("pong");
            GamePanel.startgameThread();
        });
        this.add(pongButton);

        // Future: Add more buttons for Chess, Minesweeper, Settings, etc.
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw menu background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.drawString("Welcome to the Arcade!", 300, 100);
    }
}

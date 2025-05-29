package arcade;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.BorderLayout;

import java.awt.Font;
import java.io.File;
import java.io.IOException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import pong.GamePanel;

public class MenuPanel extends JPanel {
    private Font arcadeFontLarge;
    private Font arcadeFontSmall;

    public MenuPanel(ArcadeFrame frame) {
        this.setPreferredSize(new Dimension(1000, 555));
        this.setLayout(null); // absolute positioning

        try {
            arcadeFontLarge = Font.createFont(Font.TRUETYPE_FONT, new File("src/arcade/resources/fonts/ARCADE_N.ttf")).deriveFont(30f);
            arcadeFontSmall = Font.createFont(Font.TRUETYPE_FONT, new File("src/arcade/resources/fonts/ARCADE_N.ttf")).deriveFont(15f);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
        JButton pongButton = new JButton("Play Pong");
        pongButton.setBounds(375, 200, 250, 50);
        Font BaseFont = arcadeFontSmall.deriveFont(15f);
        Font HoverFont = arcadeFontSmall.deriveFont(18f);

        addHoverEffect(pongButton, 250, 50, 270, 60, BaseFont, HoverFont);
        pongButton.addActionListener(e -> {
            frame.showScreen("pong");
            pong.GamePanel.startgameThread();
        });
        JButton chessButton = new JButton("Play Chess");
        chessButton.setBounds(375, 300, 250, 50);

    addHoverEffect(chessButton, 250, 50, 270, 60, BaseFont, HoverFont);
        chessButton.addActionListener(e -> {
            frame.showScreen("chess");
        });

        JButton minesweeperButton = new JButton("Play Minesweeper");
        minesweeperButton.setBounds(375, 400, 250, 50);
addHoverEffect(minesweeperButton, 250, 50, 300, 60, BaseFont, HoverFont);
        minesweeperButton.addActionListener(e -> {
            frame.showScreen("minesweeper");
        });

        this.add(pongButton);
        this.add(chessButton);
        this.add(minesweeperButton);
        
    }



    private void addHoverEffect(JButton button, int width, int height, int enlargedWidth, int enlargedHeight, Font baseFont, Font enlargedFont) {
    button.setFont(arcadeFontSmall);
    button.addMouseListener(new MouseAdapter() {

        @Override
        public void mouseEntered(MouseEvent e) {
            int dx = (enlargedWidth - width) / 2;
            int dy = (enlargedHeight - height) / 2;
            button.setBounds(button.getX() - dx, button.getY() - dy, enlargedWidth, enlargedHeight);
            button.setFont(enlargedFont);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            button.setBounds(button.getX() + (button.getWidth() - width) / 2,
                             button.getY() + (button.getHeight() - height) / 2,
                             width, height);
            button.setFont(baseFont);
        }
    });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw menu background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE);
        g.setFont(arcadeFontLarge);
        String title = "Welcome to the Arcade!";
        //g.drawString("Welcome to the Arcade!", 190, 100);
        FontMetrics fmTitle = g.getFontMetrics();
        int titleWidth = fmTitle.stringWidth(title);
        int titleX = (getWidth() - titleWidth) / 2;
        g.drawString(title, titleX, 100);
        //g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setFont(arcadeFontSmall);
        String controls = "ESCAPE = Exit, P = Pause/Resume";
        FontMetrics fmFooter = g.getFontMetrics();
        int footerWidth = fmFooter.stringWidth(controls);
        int footerX = (getWidth() - footerWidth) / 2;
        g.drawString(controls, footerX, getHeight() - 5);
    }
}

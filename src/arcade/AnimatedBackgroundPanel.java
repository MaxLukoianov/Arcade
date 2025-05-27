package arcade;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedBackgroundPanel extends JPanel {

    private BufferedImage backgroundImage;
    private int frameIndex = 0;
    private Timer timer;

    public AnimatedBackgroundPanel(String gifPath) {
        try {
            backgroundImage = ImageIO.read(new File(gifPath));
        } catch (IOException e) {
            System.err.println("Error loading background image: " + e.getMessage());
        }

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameIndex = (frameIndex + 1) % 10; // assuming 10 frames in the gif
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
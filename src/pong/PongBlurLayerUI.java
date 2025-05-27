package pong;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JComponent;
import javax.swing.plaf.LayerUI;

public class PongBlurLayerUI extends LayerUI<GamePanel> {
    private boolean isPaused = false;

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
        if (isPaused) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(new Color(0, 0, 0, 100)); // dark overlay
            g2.fillRect(0, 0, c.getWidth(), c.getHeight());

            g2.setFont(new Font("SansSerif", Font.BOLD, 48));
            g2.setColor(Color.WHITE);
            String text = "Paused";
            FontMetrics fm = g2.getFontMetrics();
            int x = (c.getWidth() - fm.stringWidth(text)) / 2;
            int y = (c.getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            g2.drawString(text, x, y);
            g2.dispose();
        }
    }
}

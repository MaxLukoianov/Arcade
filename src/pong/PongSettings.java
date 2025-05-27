package pong;

import arcade.GameSettings;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class PongSettings implements GameSettings {
    private int paddleSpeed = 10;
    private int paddleSize = 100;
    private int scoreLimit = 10;

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        // Add sliders later
        panel.add(new JLabel("Settings coming soon..."));
        return panel;
    }

    public void applySettings() {
        // Apply values to actual game (link via constructor or setter)
    }

    public void loadDefaults() {
        paddleSpeed = 10;
        paddleSize = 100;
        scoreLimit = 10;
    }
}

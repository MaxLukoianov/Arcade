package pong;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SettingsPanel extends JFrame {

    JSlider speedSlider;

    public SettingsPanel() {
        this.setTitle("Paddle Speed Settings");
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // Create a slider for paddle speed (range from 5 to 20)
        speedSlider = new JSlider(5, 20, Paddle.speed);  // Default value is Paddle.speed
        speedSlider.setMajorTickSpacing(5);
        speedSlider.setPaintTicks(true);
        speedSlider.setPaintLabels(true);
        speedSlider.setToolTipText("Adjust Paddle Speed");

        // Add listener to change paddle speed when the slider is moved
        speedSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Paddle.speed = speedSlider.getValue();  // Update Paddle speed based on slider
            }
        });

        // Add the slider and label to the window
        this.add(new JLabel("Paddle Speed:"));
        this.add(speedSlider);
        this.setVisible(true);
    }
}

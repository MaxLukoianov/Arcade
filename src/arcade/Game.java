package arcade;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;

import pong.GameFrame;

public abstract class Game{
    public abstract void start();     // Start or restart the game
    public abstract void pause();     // Pause the game
    public abstract void resume();    // Resume the game
    public abstract void exit();      // Exit back to menu
    public static void createPauseButton(GameFrame frame) {
        JButton pauseButton = new JButton("Pause");
        pauseButton.setBounds(400, 200, 200, 50);
        pauseButton.setBackground(Color.WHITE);
        frame.getContentPane().add(pauseButton);
        //pauseButton.addActionListener(e -> {if (GameFrame.getIsPaused()) GameFrame.resume(); else GameFrame.pause();});
    }
    public static void createExitButton(GameFrame frame) {
        JButton exitButton = new JButton("Exit");
        exitButton.setBackground(Color.WHITE);
        exitButton.setBounds(400, 200, 200, 50);
        frame.getContentPane().add(exitButton);
        //exitButton.addActionListener(e -> GameFrame.exit());
    }
    //public JPanel getSettingsPanel();  // Returns custom settings UI
}
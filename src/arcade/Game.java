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
    //public JPanel getSettingsPanel();  // Returns custom settings UI
}
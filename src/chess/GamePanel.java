package chess;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.FontFormatException;

public class GamePanel extends JPanel implements Runnable{
	
	static final int GAME_WIDTH = 700;
	static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
	static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
	public static Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	

	
	public GamePanel(){
		this.setFocusable(true);
		this.setPreferredSize(SCREEN_SIZE);
        
	}
	

    public static void startgameThread() {
        gameThread.start();
    }
    @Override
    public void run() {
    while (true){
        System.out.println("yes!");
        break;
    }
}
}


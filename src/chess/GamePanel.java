package chess;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

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
		gameThread = new Thread(this);
        
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


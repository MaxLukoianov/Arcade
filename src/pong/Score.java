package pong;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontFormatException;

public class Score extends Rectangle {

    private Font arcadeFontLarge;
    private Font arcadeFontSmall;
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;
    

    public Score(int gameWidth, int gameHeight) {
        GAME_WIDTH = gameWidth;
        GAME_HEIGHT = gameHeight;
        try {
            arcadeFontLarge = Font.createFont(Font.TRUETYPE_FONT, new File("src/arcade/resources/fonts/ARCADE_N.ttf")).deriveFont(40f);
            arcadeFontSmall = Font.createFont(Font.TRUETYPE_FONT, new File("src/arcade/resources/fonts/ARCADE_N.ttf")).deriveFont(15f);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(arcadeFontLarge);

        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
        g.drawString(String.format("%02d", player1), (GAME_WIDTH / 2) - 85, 50);
        g.drawString(String.format("%02d", player2), (GAME_WIDTH / 2) + 20, 50);
    }
    public void reset() {
        player1 = 0;    
        player2 = 0;
    }
}

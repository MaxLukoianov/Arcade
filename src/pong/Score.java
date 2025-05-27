package pong;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    public Score(int gameWidth, int gameHeight) {
        GAME_WIDTH = gameWidth;
        GAME_HEIGHT = gameHeight;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
        g.drawString(String.format("%02d", player1), (GAME_WIDTH / 2) - 85, 50);
        g.drawString(String.format("%02d", player2), (GAME_WIDTH / 2) + 20, 50);
    }
}

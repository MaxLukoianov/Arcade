package pong;

import java.awt.*;
import java.util.*;

import pong.GameFrame;

public class Ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;

    public Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();

        int randomX = random.nextInt(2) == 0 ? -1 : 1;
        int randomY = random.nextInt(2) == 0 ? -1 : 1;

        setXDirection(randomX * initialSpeed);
        setYDirection(randomY * initialSpeed);
    }

    public void setXDirection(int xDir) {
        xVelocity = xDir;
    }

    public void setYDirection(int yDir) {
        yVelocity = yDir;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, height, width);
    }
}

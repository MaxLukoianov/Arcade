package pong;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;

import arcade.Game;


public class Paddle extends Rectangle {
    int id;
    int yVelocity;
    private boolean pPressed = false;
    public static int speed = 10;  // changed to static so all paddles share speed

    public Paddle(int x, int y, int width, int height, int id) {
        super(x, y, width, height);
        this.id = id;
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void move() {
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(id == 1 ? Color.blue : Color.red);
        g.fillRect(x, y, width, height);
    }
    public void keyReleased(KeyEvent e) {
        
        if ((GameFrame.getIsPaused() == false))
        {
                switch (id) {
                    case 1:
                        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
                            setYDirection(0);
                        }
                        break;
                    case 2:
                        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
                            setYDirection(0);
                        }
                        break;
                }

        }
    }
    public void keyPressed(KeyEvent e) {
//         if (e.getKeyCode() == KeyEvent.VK_P){ // cant have it within case 1 cuz then it can't sense key P
//             if (pPressed == false) {
//                 pPressed = true;
//                 if (GameFrame.getIsPaused()) {
//                         GameFrame.resume();
//                         System.out.println("resumed");
//                     }
//                     else {
//                         GameFrame.pause();
//                         System.out.println("paused");
//                     }
//             }   
// ;          }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    //System.out.println("exit");
                    GameFrame.instance.flipHasOpened();
                    GameFrame.instance.stop();
                    GameFrame.instance.dispose();
                    
        }
        if ((GameFrame.getIsPaused() == false))
        {
            switch (id) {
            case 1: // Player 1: W/S
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                    //System.out.println("yes");
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                    //System.out.println("yes");
                }
                break;
            case 2: // Player 2: UP/DOWN
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed);
                    //System.out.println("yes");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                    //System.out.println("yes");
                }
                break;
            // case 3:
            //     if (e.getKeyCode() == KeyEvent.VK_P){
            //         GameFrame.pause();
            //     }
             }   
        }
    }
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'p') {
            //System.out.println("pressed");
            if (GameFrame.getIsPaused()) {
                GameFrame.resume();
                //System.out.println("resumed");
            } else {
                GameFrame.pause();
                //System.out.println("paused");
            }
        }
    }
}

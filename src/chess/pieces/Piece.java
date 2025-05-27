package chess.pieces;

import javax.imageio.ImageIO;

import chess.Board;

import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Piece {
    
    public int col, row;
    public int xPos, yPos;
    protected int sheetScale; 
    public boolean isWhite;
    public String name;
    public int value;

    public boolean isFirstMove = true;

    BufferedImage sheet;
    {
        try {
            sheet = ImageIO.read(getClass().getResourceAsStream("/Chess/picture/pieces.png"));
            sheetScale = sheet.getWidth() / 6;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    Image sprite;

    Board board;
    
    
    public Piece(Board board){
        this.board = board;
    }


    public boolean isValidMovement(int col, int row){
        return true;
    }

    public boolean moveCollidesWithPiece(int col, int row){
        return false;
    }


    public void paint(Graphics2D g2d){

        g2d.drawImage(sprite, xPos, yPos, null);

    }
}

package SnakeGame;

import javax.swing.*;
import java.awt.*;

public class SnakeGame extends JFrame{
    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();
        //setSize(400,400);  //400,400 leter ;;
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new SnakeGame().setVisible(true);
    }
}

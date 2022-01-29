package com.zhengyang;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

    }

    public MyFrame(){
        //set frame set
        this.setSize(800,600);
        //put in the middle
        this.setLocationRelativeTo(null);

        //set visibility
        this.setVisible(true);

        //set close frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set  frame immunutable
        this.setResizable(false);

        this.addKeyListener(this);
        //set name of frame
        this.setTitle("superMario");

        //initalize image
        StaticValue.init();


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

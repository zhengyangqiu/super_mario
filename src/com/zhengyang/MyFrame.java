package com.zhengyang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class MyFrame extends JFrame implements KeyListener {

    //store all the background

    private List<BackGround> allBg = new ArrayList<>();

    //store current background

    private BackGround nowBg = new BackGround();

    //double buffers
    private Image offScreenImage = null;





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

        //set  frame imunutable
        this.setResizable(false);

        this.addKeyListener(this);
        //set name of frame
        this.setTitle("superMario");

        //initalize image
        StaticValue.init();

        //create all the scene

        for (int i = 1; i <=3 ; i++) {
            allBg.add(new BackGround(i,i == 3 ? true : false));

        }

        //set first scene as current scene

        nowBg = allBg.get(0);
        //paint image
        repaint();


    }


    @Override
    public void paint(Graphics g) {
        if (offScreenImage==null){
            offScreenImage=createImage(800,600);
        }
        Graphics graphics = offScreenImage.getGraphics();
        graphics.fillRect(0,0,800,600);

        //draw background image

        graphics.drawImage(nowBg.getBgImage(),0,0,this);

        //draw obstacles
        for (Obstacle ob:nowBg.getObstacleList()){
            graphics.drawImage(ob.getShow(),ob.getX(),ob.getY(),this);
        }

        //put image in the window
        g.drawImage(offScreenImage,0,0,this);
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

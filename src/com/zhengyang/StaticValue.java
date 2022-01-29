package com.zhengyang;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StaticValue {
    //background

    public static BufferedImage bg = null;
    public static BufferedImage bg2 = null;

    //left jump
    public static BufferedImage jump_L=null;

    //right jump

    public static BufferedImage jump_R = null;

    //stand left
    public static BufferedImage stand_L = null;

    //stand right
    public static BufferedImage stand_R = null;

    //tower
    public static BufferedImage tower= null;

    //flag

    public static BufferedImage flag = null;


    //obstacle
    public static List<BufferedImage>obstacle= new ArrayList<>();

    //maria run to left
    public static List<BufferedImage> run_L = new ArrayList<>();

    //Maria run to right

    public static List<BufferedImage> run_R = new ArrayList<>();

    //mushroom enemy
    public static List<BufferedImage> mushroom=new ArrayList<>();

    //flower enemy

    public static List<BufferedImage> flower = new ArrayList<>();
    //path
    public static String path = System.getProperty("user.dir")+"/src/images/";

    //initialize
    public static void init(){
        //background

        try {
            bg = ImageIO.read(new File(path+"bg.png"));
            bg2= ImageIO.read(new File(path+"bg2.png"));
            //stand left

            stand_L=ImageIO.read(new File(path+"s_mario_stand_L.png"));

            //stand right

            stand_R=ImageIO.read(new File(path+"s_mario_stand_R.png"));

            //load tower
            tower=ImageIO.read(new File(path+"tower.png"));
            // load flag
            flag=ImageIO.read(new File(path+"gan.png"));

            //jump to left
            jump_L=ImageIO.read(new File(path+"s_mario_jump1_L.png"));
            //jump to right

            jump_R=ImageIO.read(new File(path+"s_mario_jump1_R.png"));


        } catch (IOException e) {
            e.printStackTrace();
        }

        // run to the left

        for (int i=1;i<=2;i++){
            try {
                run_L.add(ImageIO.read(new File(path +"s_mario_run"+i+"_L.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        //run to the right
        for (int i=1;i<=2;i++){
            try {
                run_R.add(ImageIO.read(new File(path +"s_mario_run"+i+"_R.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        //load obtacle
        try {
            obstacle.add(ImageIO.read(new File(path+"brick.png")));
            obstacle.add(ImageIO.read(new File(path+"soil_up.png")));
            obstacle.add(ImageIO.read(new File(path+"soil_base.png")));

        } catch (IOException e) {
            e.printStackTrace();
        }



        //load pipe
        for (int i = 1; i <=4; i++) {
            try {
                obstacle.add(ImageIO.read(new File(path+"pipe"+i+".png")));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        //load brick

        try {
            obstacle.add(ImageIO.read(new File(path+"brick2.png")));
            obstacle.add(ImageIO.read(new File(path+"flag.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //load mushroom enemy

        for (int i = 1; i <=3; i++) {

            try {
                mushroom.add(ImageIO.read(new File(path+"fungus"+i+".png")));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        //load flower enemy

        for (int i = 1; i <= 2; i++) {

            try {
                flower.add(ImageIO.read(new File(path+"flower1."+i+".png")));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }





    }










}

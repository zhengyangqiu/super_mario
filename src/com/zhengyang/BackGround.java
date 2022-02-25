package com.zhengyang;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class BackGround {
    //background image


    private BufferedImage bgImage = null;


    //number of scene

    private int sort;


    //is final scene


    private boolean flag;

    //list to store obstacle

    private List<Obstacle> obstacleList = new ArrayList<>();


    public BackGround() {

    }

    public BackGround(int sort, boolean flag) {
        this.sort = sort;
        this.flag = flag;

        if (flag) {
            bgImage = StaticValue.bg2;

        } else {
            bgImage = StaticValue.bg;
        }

        //judge if it is level 1
        if (sort == 1) {

            //the floor
            for (int i = 0; i < 27; i++) {
                obstacleList.add(new Obstacle(i * 30, 420, 1, this));
            }

            for (int j = 0; j <= 120; j += 30) {
                for (int i = 0; i < 27; i++) {
                    obstacleList.add(new Obstacle(i * 30, 570 - j, 2, this));
                }

            }
            //draw brick A
            for (int i = 120; i <= 150; i += 30) {
                obstacleList.add(new Obstacle(i, 300, 7, this));
            }

            //draw brick B-F
            for (int i = 300; i <= 570; i += 30) {
                if (i == 300 || i == 390 || i == 480 || i == 510 || i == 540) {
                    obstacleList.add(new Obstacle(i, 300, 7, this));
                } else {
                    obstacleList.add(new Obstacle(i, 300, 0, this));
                }

            }

            //draw brick g
            for (int i = 420; i <= 450; i += 30) {
                obstacleList.add(new Obstacle(i, 240, 7, this));
            }
            //draw pipeline

            for (int i = 300; i <= 600; i += 25) {
                if (i == 360) {
                    obstacleList.add(new Obstacle(620, i, 3, this));
                    obstacleList.add(new Obstacle(645, i, 4, this));

                } else {
                    obstacleList.add(new Obstacle(620, i, 5, this));
                    obstacleList.add(new Obstacle(645, i, 6, this));

                }
            }


        }

    }

    public BufferedImage getBgImage() {
        return bgImage;
    }

    public int getSort() {
        return sort;
    }

    public boolean isFlag() {
        return flag;
    }

    public List<Obstacle> getObstacleList() {
        return obstacleList;
    }


}

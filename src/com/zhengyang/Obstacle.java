package com.zhengyang;

import java.awt.image.BufferedImage;

public class Obstacle {
    // coordinate

    private int x;
    private int y;
    //type

    private int type;
    //display image

    private BufferedImage show = null;

    //display background

    private BackGround bg = null;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getType() {
        return type;
    }

    public BufferedImage getShow() {
        return show;
    }

    public Obstacle(int x, int y, int type, BackGround bg) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.bg = bg;
        show = StaticValue.obstacle.get(type);

    }


}

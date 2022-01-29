package com.zhengyang;

import java.awt.image.BufferedImage;

public class BackGround {
    //background image


    private BufferedImage bgImage = null;


    //number of scene

    private int sort;


    //is final scene


    private boolean flag;

    public BackGround(){

    }

    public BackGround(int sort,boolean flag){
        this.sort = sort;
        this.flag =flag;

        if (flag){
            bgImage=StaticValue.bg2;

        }else{
            bgImage =StaticValue.bg;
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



}

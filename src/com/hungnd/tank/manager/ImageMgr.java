package com.hungnd.tank.manager;

import com.hungnd.tank.unitl.Common;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;


public class ImageMgr {
    public static ArrayList<Image> arrItemsImages;
    public static ArrayList<Image> arrPlayerImages;
    public static ArrayList<Image> arrBoss1Images;
    public static ArrayList<Image> arrBoss21Images;
    public static ArrayList<Image> arrBoss22Images;
    public static ArrayList<Image> arrBoss31Images;
    public static ArrayList<Image> arrBoss32Images;
    public static ArrayList<Image> arrBoss33Images;
    public static ArrayList<Image> arrBulletImages;
    public static ArrayList<Image> arrGiftImages;
    public static ArrayList<Image> arrBumImages;
    public static ArrayList<Image> arrNumImages;
    public static ArrayList<Image> arrBirdImages;
    public static Image imageStart;
    public static Image imageIconBoss;
    public static Image imageLeft;
    public static Image imageRight;
    public ImageMgr() {
        arrItemsImages = getImage("unit", Common.ITEM_SIZE, Common.ITEM_SIZE, 6);
        arrPlayerImages = getImage("player", Common.TANK_SIZE, Common.TANK_SIZE, 4);
        arrBoss1Images = getImage("boss1", Common.TANK_SIZE, Common.TANK_SIZE,4);
        arrBoss21Images = getImage("boss2", Common.TANK_SIZE, Common.TANK_SIZE,4);
        arrBoss22Images = getImage("boss22", Common.TANK_SIZE, Common.TANK_SIZE,4);
        arrBoss31Images = getImage("boss31", Common.TANK_SIZE,Common.TANK_SIZE, 4);
        arrBoss32Images = getImage("boss32", Common.TANK_SIZE,Common.TANK_SIZE, 4);
        arrBoss33Images = getImage("boss33", Common.TANK_SIZE,Common.TANK_SIZE, 4);
        arrBulletImages = getImage("bullet", Common.BULLET_SIZE,Common.BULLET_SIZE, 4);
        arrBumImages = getImage("bum", Common.TANK_SIZE * 2,Common.TANK_SIZE * 2, 9);
        arrGiftImages=getImage("gift",Common.TANK_SIZE, Common.TANK_SIZE, 2);
        arrNumImages = getImage("num_level", 16, 16, 10);
        arrBirdImages = getImage("bird", Common.TANK_SIZE, Common.TANK_SIZE, 2);
        imageStart = new ImageIcon(getClass().getResource("/IMAGES/game_start.png")).getImage();
        imageIconBoss = new ImageIcon(getClass().getResource("/IMAGES/icon_boss.png")).getImage();
        imageLeft = new ImageIcon(getClass().getResource("/IMAGES/left.png")).getImage();
        imageRight = new ImageIcon(getClass().getResource("/IMAGES/right.png")).getImage();
    }

    public ArrayList<Image> getImage(String name, int width, int height, int count) {
        ArrayList<Image> arrImage = new ArrayList<>();
        try {
            BufferedImage bufferedImage = ImageIO.read(getClass().getResourceAsStream("/IMAGES/" + name + ".png"));
            BufferedImage supImage ;
            for (int i = 0; i < count; i++) {
                supImage = bufferedImage.getSubimage(0, i * height, width, height);
                arrImage.add(supImage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrImage;
    }
}

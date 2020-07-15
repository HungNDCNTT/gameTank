package com.hungnd.tank.model;

import com.hungnd.tank.manager.ImageMgr;

import java.awt.*;

public class MapItem extends Model {
    private int type;

    public MapItem(int type) {
        this.type = type;
    }

    public MapItem(int x, int y, int width, int height, int type) {
        super(x, y, width, height);
        this.type = type;
        this.image = ImageMgr.arrItemsImages.get(type);//dua vao type de lay image
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

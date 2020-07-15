package com.hungnd.tank.manager;

import com.hungnd.tank.model.MapItem;
import com.hungnd.tank.unitl.Common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class MapMgr {
    private List<MapItem> arrMap;
    private int level;

    public MapMgr() {

    }

    public MapMgr(int level) {
        this.level = level;
        setArrMap();
    }

    private void setArrMap() {
        arrMap.clear();
        File file = new File("src/MAPS/map" + level);
        try {
            RandomAccessFile rd = new RandomAccessFile(file, "r");
            int row = 0;
            String line = rd.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    int type = line.charAt(i) - 48;
                    MapItem mapItem = new MapItem(i * Common.ITEM_SIZE, row * Common.ITEM_SIZE, Common.ITEM_SIZE, Common.ITEM_SIZE, type);
                    arrMap.add(mapItem);
                }
                line=rd.readLine();
                row++;
            }
            rd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<MapItem> getArrMap() {
        return arrMap;
    }

    public void setArrMap(List<MapItem> arrMap) {
        this.arrMap = arrMap;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

package com.example.meganpekarek.gameproject;

/**
 * Created by meganpekarek on 12/5/16.
 */
public class Item {

    private String title;

    private int itemID;

    public Item(String title, int itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    public String getName() {
        return title;
    }

    public int getItemID() {
        return itemID;
    }
}


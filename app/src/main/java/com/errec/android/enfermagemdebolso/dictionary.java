package com.errec.android.enfermagemdebolso;

/**
 * Created by Raniro on 29/04/2016.
 */
    public class Dictionary {

        private String name;
        private int iconID;
        private String category;

    public Dictionary(String name, int iconID, String category) {

        this.name = name;
        this.iconID = iconID;
        this.category = category;
    }

    public String getMake() {
        return name;
    }

    public int getIconID() {
        return iconID;
    }

    public String getCondition() {
        return category;
    }
}

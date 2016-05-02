package com.errec.android.enfermagemdebolso;

    public class Dictionary {

        private String name;
        private int iconID;
        private String category;

    public Dictionary(String name, int iconID, String category) {

        this.name = name;
        this.iconID = iconID;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getIconID() {
        return iconID;
    }

    public String getCategory() {
        return category;
    }
}

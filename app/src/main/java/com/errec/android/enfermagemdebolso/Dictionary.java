package com.errec.android.enfermagemdebolso;

public class Dictionary {

    private String name;
    private int iconID;
    private String category;
    private String description;

    public Dictionary(String name, int iconID, String category, String description) {

        this.name = name;
        this.iconID = iconID;
        this.category = category;
        this.description = description;
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

    public String getDescription() {
        return description;
    }
}

package com.example.list_view;

public class list_element {
    private int image;
    private String name;
    private String mssv;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public list_element(int image, String name, String mssv) {
        this.image = image;
        this.name = name;
        this.mssv = mssv;
    }
}

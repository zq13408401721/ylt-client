package com.yltclient.bean;

public class Bean {
    private String title;
    private String txt;
    private String txt1;
    private String date;

    public Bean(String title, String txt, String txt1, String date) {
        this.title = title;
        this.txt = txt;
        this.txt1 = txt1;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "bean{" +
                "title='" + title + '\'' +
                ", txt='" + txt + '\'' +
                ", txt1='" + txt1 + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

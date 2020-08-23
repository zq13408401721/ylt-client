package com.yltclient.bean.mine;

public class AssetDetailBean {
    private String type;
    private String date;
    private String coinNum;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCoinNum() {
        return coinNum;
    }

    public void setCoinNum(String coinNum) {
        this.coinNum = coinNum;
    }

    public AssetDetailBean(String type, String date, String coinNum) {
        this.type = type;
        this.date = date;
        this.coinNum = coinNum;
    }
}

package com.yltclient.bean;

public class Rlv2Bean {
    private String name;
    private String zhang;
    private String die;

    public Rlv2Bean(String name, String zhang, String die) {
        this.name = name;
        this.zhang = zhang;
        this.die = die;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhang() {
        return zhang;
    }

    public void setZhang(String zhang) {
        this.zhang = zhang;
    }

    public String getDie() {
        return die;
    }

    public void setDie(String die) {
        this.die = die;
    }

    @Override
    public String toString() {
        return "Rlv2Bean{" +
                "name='" + name + '\'' +
                ", zhang='" + zhang + '\'' +
                ", die='" + die + '\'' +
                '}';
    }
}

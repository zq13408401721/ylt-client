package com.yltclient.bean.mine;

public class ChargeRecordBean {
    String chargeTime;
    String chargeNum;
    String chargeState;

    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }

    public String getChargeNum() {
        return chargeNum;
    }

    public void setChargeNum(String chargeNum) {
        this.chargeNum = chargeNum;
    }

    public String getChargeState() {
        return chargeState;
    }

    public void setChargeState(String chargeState) {
        this.chargeState = chargeState;
    }

    public ChargeRecordBean(String chargeTime, String chargeNum, String chargeState) {
        this.chargeTime = chargeTime;
        this.chargeNum = chargeNum;
        this.chargeState = chargeState;
    }
}

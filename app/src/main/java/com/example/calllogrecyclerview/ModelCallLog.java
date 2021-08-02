package com.example.calllogrecyclerview;

public class ModelCallLog {
    private int image;
    private int dialIcon;
    private String callType;

    private String callerName;
    private String operatorName;
    private String callTime;
    private String countryName;

    public ModelCallLog(int image, int dialIcon, String callType, String callerName, String operatorName, String callTime, String countryName) {
        this.image = image;
        this.dialIcon = dialIcon;
        this.callType = callType;
        this.callerName = callerName;
        this.operatorName = operatorName;
        this.callTime = callTime;
        this.countryName = countryName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getDialIcon() {
        return dialIcon;
    }

    public void setDialIcon(int dialIcon) {
        this.dialIcon = dialIcon;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getCallTime() {
        return callTime;
    }

    public void setCallTime(String callTime) {
        this.callTime = callTime;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

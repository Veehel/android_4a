package com.lab.android_4a.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Comic {

    @SerializedName("num")
    private Integer num;

    @SerializedName("day")
    private String day;

    @SerializedName("month")
    private String month;

    @SerializedName("year")
    private String year;

    @SerializedName("title")
    private String title;

    @SerializedName("safe_title")
    private String safe_title;

    @SerializedName("transcript")
    private String transcript;

    @SerializedName("alt")
    private String alt;

    @SerializedName("img")
    private String img;

    public Comic(Integer num, String day, String month, String year, String title, String safe_title, String transcript, String alt, String img) {
        this.num = num;
        this.day = day;
        this.month = month;
        this.year = year;
        this.title = title;
        this.safe_title = safe_title;
        this.transcript = transcript;
        this.alt = alt;
        this.img = img;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSafe_title() {
        return safe_title;
    }

    public void setSafe_title(String safe_title) {
        this.safe_title = safe_title;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

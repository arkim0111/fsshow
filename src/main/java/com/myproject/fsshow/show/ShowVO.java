package com.myproject.fsshow.show;

public class ShowVO {

    private String SHOW_ID; // 쇼 아이디
    private int SHOW_YEAR; // 개최 연도
    private String SHOW_NAME; // 쇼 이름
    private String SHOW_ADDR; // 개최 장소
    private String SHOW_DATE; // 개최 날짜
    private String SHOW_POST_IMG; // 포스터 이미지
    private String SHOW_SEAT_IMG; // 좌석배치도 이미지

    public String getSHOW_ID() {
        return SHOW_ID;
    }

    public void setSHOW_ID(String SHOW_ID) {
        this.SHOW_ID = SHOW_ID;
    }

    public int getSHOW_YEAR() {
        return SHOW_YEAR;
    }

    public void setSHOW_YEAR(int SHOW_YEAR) {
        this.SHOW_YEAR = SHOW_YEAR;
    }

    public String getSHOW_NAME() {
        return SHOW_NAME;
    }

    public void setSHOW_NAME(String SHOW_NAME) {
        this.SHOW_NAME = SHOW_NAME;
    }

    public String getSHOW_ADDR() {
        return SHOW_ADDR;
    }

    public void setSHOW_ADDR(String SHOW_ADDR) {
        this.SHOW_ADDR = SHOW_ADDR;
    }

    public String getSHOW_DATE() {
        return SHOW_DATE;
    }

    public void setSHOW_DATE(String SHOW_DATE) {
        this.SHOW_DATE = SHOW_DATE;
    }

    public String getSHOW_POST_IMG() {
        return SHOW_POST_IMG;
    }

    public void setSHOW_POST_IMG(String SHOW_POST_IMG) {
        this.SHOW_POST_IMG = SHOW_POST_IMG;
    }

    public String getSHOW_SEAT_IMG() {
        return SHOW_SEAT_IMG;
    }

    public void setSHOW_SEAT_IMG(String SHOW_SEAT_IMG) {
        this.SHOW_SEAT_IMG = SHOW_SEAT_IMG;
    }
}

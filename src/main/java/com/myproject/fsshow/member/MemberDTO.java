package com.myproject.fsshow.member;

public class MemberDTO {
    private Number MEM_LEV; // 회원 구분
    private Number MEM_IDX; // 회원 고유 번호
    private String MEM_ID; // 아이디
    private String MEM_PW; // 비밀번호
    private String MEM_NAME; // 이름
    private String MEM_EMAIL; // 이메일
    private String MEM_PHONE; // 전화번호

    public Number getMEM_LEV() {
        return MEM_LEV;
    }

    public void setMEM_LEV(Number MEM_LEV) {
        this.MEM_LEV = MEM_LEV;
    }

    public Number getMEM_IDX() {
        return MEM_IDX;
    }

    public void setMEM_IDX(Number MEM_IDX) {
        this.MEM_IDX = MEM_IDX;
    }

    public String getMEM_ID() {
        return MEM_ID;
    }

    public void setMEM_ID(String MEM_ID) {
        this.MEM_ID = MEM_ID;
    }

    public String getMEM_PW() {
        return MEM_PW;
    }

    public void setMEM_PW(String MEM_PW) {
        this.MEM_PW = MEM_PW;
    }

    public String getMEM_NAME() {
        return MEM_NAME;
    }

    public void setMEM_NAME(String MEM_NAME) {
        this.MEM_NAME = MEM_NAME;
    }

    public String getMEM_EMAIL() {
        return MEM_EMAIL;
    }

    public void setMEM_EMAIL(String MEM_EMAIL) {
        this.MEM_EMAIL = MEM_EMAIL;
    }

    public String getMEM_PHONE() {
        return MEM_PHONE;
    }

    public void setMEM_PHONE(String MEM_PHONE) {
        this.MEM_PHONE = MEM_PHONE;
    }
}

package com.example.exam;

public class ClassXe {
    String tenxe;
    String hangxe;
    int namsx;
    String hinh;

    public ClassXe(String tenxe, String hangxe, int namsx, String hinh) {
        this.tenxe = tenxe;
        this.hangxe = hangxe;
        this.namsx = namsx;
        this.hinh = hinh;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getHangxe() {
        return hangxe;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
}

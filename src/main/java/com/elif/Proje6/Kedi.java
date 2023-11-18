package com.elif.Proje6;

public class Kedi extends MemeliHayvan {
    public Kedi(String isim, String renk) {
        super(isim, renk);
    }

    @Override
    public void yavrusunuBesleme() {
        super.yavrusunuBesleme();
        System.out.println(isim + "adlı kedi yavrusunu besledi.");
    }
}

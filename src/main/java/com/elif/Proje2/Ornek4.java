package com.elif.Proje2;

import java.util.Scanner;

public class Ornek4 {
    /*
        Ekrandan okunan 3 karakter verinin (String) ASCII kodu olarak karakter toplamının
        en büyüğünü bularak ekrana yazdıran bilgisayar
        programını Java programlama dilinde yazınız.
     */
    public static void main(String[] args) {
    String deger1=metinAl();
    int deger1Toplam=karakterlerinToplami(deger1);

    String deger2=metinAl();
    int deger2Toplam=karakterlerinToplami(deger2);

    String deger3=metinAl();
    int deger3Toplam=karakterlerinToplami(deger3);

    if(deger1Toplam>deger2Toplam && deger1Toplam>deger3Toplam){
        System.out.println( deger1 + " metninin ASCII kod karşılığı olarak karakterler toplamı en büyüktür.");
    } else if (deger2Toplam>deger1Toplam && deger2Toplam>deger3Toplam) {
        System.out.println( deger2 + " metninin ASCII kod karşılığı olarak karakterler toplamı en büyüktür.");
    }else if (deger3Toplam>deger1Toplam && deger3Toplam>deger2Toplam) {
        System.out.println( deger2 + " metninin ASCII kod karşılığı olarak karakterler toplamı en büyüktür.");
    }else if(deger1Toplam==deger2Toplam || deger2Toplam==deger3Toplam || deger3Toplam==deger1Toplam){
        System.out.println("Girdiğiniz iki metnin karakterler toplamı aynıdır.");
    }

    }

    public static int karakterlerinToplami(String metin){
        char ch;
        int ascii;
        int toplam=0;

        for(int i=0; i<metin.length(); i++){
            ch=metin.charAt(i);
            ascii=(int)ch;
            toplam +=ascii;
        }
        return toplam;
    }
    public static String metinAl(){
        System.out.println("Lütfen bir metin giriniz.");
        return new Scanner(System.in).nextLine();
    }
}

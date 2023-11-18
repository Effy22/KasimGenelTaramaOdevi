package com.elif.Proje1.Degiskenler;

public class Runner_Ornek_Ilkel_Veri_Tipleri {
    public static void main(String[] args) {

        //Değişkenler için iki şekilde de tanım yapabiliriz.
        // ilki sadece initialize etmek olur. ikinci örneklerde ise değer atamış oluruz.

        //byte veri tipi örneği;
        byte byteVerisi;
        byte a = 5;

        //short veri tipi örneği
        short shortVerisi;
        short b = 1923;

        //integer veri tipi örneği
        int tamsayi;
        int c = 1234;

        //long veri tipi örneği
        long longSayi;
        long d = 12345566788768768L; //CAST İŞLEMİ ÖRNEĞİ (Yanına L yazmak)

        //float veri tipi örneği
        float sayi;
        float e = 1.2f;

        //double veri tipi örneği
        double sayi2;
        double f = 5.3;

        //char veri tipi örneği
        char karakter;
        char harf = 'x'; //1'den fazla karakter alamaz.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(harf);


    }
}

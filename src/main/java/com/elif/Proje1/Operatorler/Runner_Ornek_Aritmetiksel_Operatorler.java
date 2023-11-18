package com.elif.Proje1.Operatorler;

public class Runner_Ornek_Aritmetiksel_Operatorler {
    public static void main(String[] args) {
        //TOPLAMA OPERATÖRÜ
        int a=10, b=2;
        int toplam =a+b;
        System.out.println("Toplam işleminin sonucu: " +toplam);

        //ÇIKARTMA OPERATÖRÜ
        int cikartma=a-b;
        System.out.println("Çıkartma işleminin sonucu: " +cikartma);

        //BÖLME OPERATÖRÜ
        int bolme=a/b;
        System.out.println("Bölme işleminin sonucu: " +bolme);

        //ÇARPMA OPERATÖRÜ
        int carpma=a*b;
        System.out.println("Çarpma işleminin sonucu: " +carpma);

        //MOD ALMA
        int mod=a%b;
        System.out.println("Mod alma işleminin sonucu: " +mod);

        //STRING İFADELERİ BİRLEŞTİRME
        String kelime="el";
        String kelime2 ="if";
        System.out.println("String ifadelerin birleşimi: "+kelime+kelime2);

    }
}

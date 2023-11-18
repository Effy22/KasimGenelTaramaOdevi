package com.elif.Proje1.Operatorler;

public class Runner_Ornek_Karsilastirma_Operatorleri {

    public static void main(String[] args) {
        //BÜYÜK MÜ >
        int sayi1=3, sayi2=4, sayi3=3;
        System.out.println("İlk değer ikincisinden büyük mü?");
        System.out.println(sayi1>sayi2);

        //KÜÇÜK MÜ <
        System.out.println("İlk değer ikincisinden küçük mü?");
        System.out.println(sayi1<sayi2);

        //BÜYÜK EŞİT Mİ >=
        System.out.println("İlk değer ikincisinden büyük ya da eşit mi?");
        System.out.println(sayi1>=sayi2);

        //KÜÇÜK EŞİT Mİ <=
        System.out.println("İlk değer ikincisinden küçük ya da eşit mi?");

        System.out.println(sayi1<=sayi2);

        //EŞİT Mİ
        System.out.println("Değerler birbirine eşit mi?");
        System.out.println(sayi1==sayi3);

        //EŞİT DEĞİL Mİ?
        System.out.println("Değerler birbirine eşit değil mi?");
        System.out.println(sayi1!=sayi2);

        //KARŞILAŞTIRMA İŞLEMLERİNDE KULLANILAN BAZI ÖZEL METOTLAR VE SİMGELER

        //KÜÇÜK (min), BÜYÜK(max)
        System.out.println(Math.max(sayi1,sayi2));
        System.out.println(Math.min(sayi1,sayi2));

        //TENARY OPERATÖRÜ (İkili karşılaştırma)

        String durum=sayi1<sayi2  ? "Durum doğrudur.":"Durum yanlıştır";
        System.out.println(durum);

    }
}

package com.elif.Proje1.Operatorler;

public class Runner_Ornek_Arttirma_Azaltma_Operatorleri {
    public static void main(String[] args) {

        //ÖN ARTTIRMA OPERATÖRÜ
        int a=10;
        System.out.println("İlk atadığımız değer..:"+a);
        System.out.println("Ön arttırma operatörü kullandığımızda..:"+ (++a));

        //SON ARTTIRMA OPERATÖRÜ
        int b = 10;
        System.out.println("İlk atadığımız değer..:"+b);
        System.out.println("Son arttırma operatörü kullandığımızda değişmez..:"+ (b++));
        System.out.println("Bir dahakine aynı değeri kullandığımızda..:"+ b);

        //ÖN AZALTMA OPERATÖRÜ
        int c =10;
        System.out.println("İlk atadığımız değer..:"+c);
        System.out.println("Ön arttırma operatörü kullandığımızda..:"+ (--c));

        //SON AZALTMA OPERATÖRÜ
        int d = 10;
        System.out.println("İlk atadığımız değer..:"+c);
        System.out.println("Son arttırma operatörü kullandığımızda değişmez..:"+ (c--));
        System.out.println("Bir dahakine aynı değeri yazdığımız zaman..:"+ c);


    }
}

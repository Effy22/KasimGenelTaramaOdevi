package com.elif.Proje1.Degiskenler;

import java.util.Locale;

public class Runner_Ornek_Referans_Veri_Tipleri {
    public static void main(String[] args) {
            //İlk örnekteki gibi tüm değişkenler için; initialize ettikten sonra değer ataması yapılabilir.
             String ifade1;
             ifade1="Metin";

             //Bu örnekte ise initialize ederken tanımlama yaptık;
             String ifade="Bu bir metindir.";

        //STRING METOTLARI
        String value="Merhaba Dünya";
        String value2=" Merhaba Dünya";
        String value3="Merhaba Dünya";
        String value4=new String ("Merhaba Dünya");
        System.out.println(value.lastIndexOf("a")); //metin içerisindeki bir değerin son indexini verir.
        System.out.println(value.indexOf("a")); //ilk değerin ilk indexini içerir
        System.out.println(value.indexOf("x")); //x değeri yoksa -1 çıktısını alırız
        System.out.println(value.charAt(1)); //char bizden integer bir değer ister o numaradaki karakteri koyar
        System.out.println(value2);
        System.out.println(value2.trim()); //başında var ise boşlukları temizler.
        System.out.println(value2.contains("m"));//m harfini içeriyor mu diye soru sorar, boolean döner
        System.out.println(value.substring(1));
        System.out.println(value.substring(1,3));//bize verilen değerin 1(dahil)'den başlayarak 3'kadar olan karakterlerini ardışık verir.
        System.out.println(value.toUpperCase()); //tüm harfleri büyütmek için kullanılan metot
        System.out.println(value.toLowerCase()); //tüm harfleri küçültmek için kullanılan metot
        System.out.println(value.toUpperCase(Locale.ENGLISH));
        System.out.println(value.replace("a", "x"));

        //Split

        String value6= "Java-React-Css";

        String [] array=value6.split("-");//- ile girilen String ifadeyi böler bir diziye atarız.

        //String değerini sayı değerine döndürmek için;
        String value7= "10";
        System.out.println(5 +value7);
        int sayi1=Integer.parseInt(value7); //bir string değeri int değerine çevirir.
        System.out.println(5 +sayi1);

        // karakteri direkt sayıya çevirmek istesek;
        int vallue2= Character.getNumericValue(value.charAt(1)); //1 yerine istediğimiz indexi yazabiliriz.

        //İLKEL VERİ TİPLERİNİN REFERANS VERİ TİPİ OLARAK YAZILMASI;
        Character char_3 = 'C';
        Integer int_3 = 235345436;
        Long long_3 = 445235683458275477L;
        Float float_4 = 8.2354287394729384723f;
        Boolean boolean_3 = true;


    }
}

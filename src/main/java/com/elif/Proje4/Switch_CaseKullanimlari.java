package com.elif.Proje4;

import java.util.Scanner;

public class Switch_CaseKullanimlari {
    /*
        Switch case, kod olarak daha temiz olup hızlı bir yanıt verebilen mekanizmadır.
        Bir değeri incelemek ve kontrol etmek için birebir uyuma bakar ve doğru ise
        yazılan kod çalışır.

        Girilen Değişkenin belirli değerlerine göre yapılacak farklı işlemlerin seçimlerinde
        kullanılır.Değişken; char, byte,short,int,String primitive type'ların Referans karşılığı olan
        değişkenler de olabilir.
     */
    public static void main(String[] args) {

        //SWITCH CASE YAZIM ÇEŞİDİ 1;
        Scanner sc=new Scanner(System.in);
        menuYaz();
        System.out.println("Lütfen bir seçim yapınız...:");
        int secim =sc.nextInt();

        switch(secim){
            case 1:
                System.out.println("Lütfen adınızı giriniz..:");
                String isim=new Scanner(System.in).nextLine();break;
            case 2:
                System.out.println("Lütfen soyadınızı giriniz..:");
                String soyad=new Scanner(System.in).nextLine();break;
            case 3:
                System.out.println("Lütfen ehliyetinizi aldığınız yılı giriniz..:");
                String ehliyetYili=new Scanner(System.in).nextLine();break;
            case 4:
                System.out.println("Lütfen geldiğiniz ülkeyi giriniz..:");
                String ulke=new Scanner(System.in).nextLine();break;
            default :
                System.out.println("Lütfen geçerli bir sayı giriniz..");break;
        }

        //SWITCH CASE YAZIM ÇEŞİDİ 2; (maasMiktarı adlı metodun içerisindedir)
        System.out.println("Lütfen firmanızdaki ünvanınızı giriniz..:");
        double maas=maasMiktari(new Scanner(System.in).nextLine());

        //SWICH CASE YAZIM ÇEŞİDİ 3; Enumlar ile

        Ornek ornek=new Ornek();
        ornek.aylar= Aylar.HAZIRAN;
        ornek.gun=21;

         String cikti= switch(ornek.getAylar()){
             case OCAK -> "Oğlak ya da Kova burcu olabilirsiniz.";
             case SUBAT -> "Kova ya da Balık burcu olabilirsiniz.";
             case MART -> "Balık ya da Koç burcu olabilirsiniz.";
             case NISAN -> "Koç ya da Boğa burcu olabilirsiniz.";
             case MAYIS -> "Boğa ya da ikizler burcu olabilirsiniz.";
             case HAZIRAN -> "İkizler ya da Yengeç burcu olabilirsiniz.";
             case TEMMUZ -> "Yengeç ya da Aslan burcu olabilirsiniz.";
             case AGUSTOS -> "Aslan ya da Başak burcu olabilirsiniz.";
             case EYLUL -> "Başak ya da Terazi burcu olabilirsiniz.";
             case EKIM -> "Terazi ya da Akrep burcu olabilirsiniz.";
             case KASIM -> "Akrep ya da Yay burcu olabilirsiniz.";
             case ARALIK -> "Yay ya da Oğlak burcu olabilirsiniz.";
             default -> "Lütfen doğru yazınız";
        };
        System.out.println(cikti);


    }

    public static void menuYaz(){
        System.out.println("------   MENU --------");
        System.out.println("1- Adınızı yazın");
        System.out.println("2- Soyadınızı yazın");
        System.out.println("3- Ehliyetinizin alınan yılını yazın");
        System.out.println("4- Ülkenizi yazın");
    }

    public static double maasMiktari(String unvan){
        switch (unvan){
            case "Müdür": return 120_000d;
            case "Analitik Uzman": return 50_000d;
            case "Formülasyon Uzmanı": return 60_000d;
            case "Direktör": return 80_000d;
            case "Analitik Uzman Yardımcısı": return 28_000d;
            case "Formülasyon Uzman Yardımcısı": return 35_000d;
            default : return 25_000d;
        }
    }
}

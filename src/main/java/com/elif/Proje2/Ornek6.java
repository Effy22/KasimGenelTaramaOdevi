package com.elif.Proje2;

import java.util.Scanner;

public class Ornek6 {
    /*
        3-100 Sistemde girilen notu 5lik sisteme çevirme

     */
    public static void main(String[] args) {

        double not1;
        double not2;
        double finalnot;
        double ortalama;
        do{
            System.out.println("Lütfen öğrencinin 1. notunu giriniz..: ");
            not1 =new Scanner(System.in).nextDouble();
            System.out.println("Lütfen öğrencinin 2. notunu giriniz..: ");
            not2 =new Scanner(System.in).nextDouble();
            System.out.println("Lütfen öğrencinin final notunu giriniz..: ");
            finalnot =new Scanner(System.in).nextDouble();
            ortalama=((not1*0.30)+(not2*0.30)+(finalnot*0.40));

            if(ortalama<0 || ortalama>100){
                System.out.println("Lütfen 0 ile 100 arasında bir not giriniz.");
            }else if(ortalama>0 && ortalama<50){
                System.out.println("Öğrencinin notunun 5'lik sistemdeki değeri---> 1");
                System.out.println("Öğrenci dersten kaldı.");
            }else if(ortalama>=50 && ortalama<60){
                System.out.println("Öğrencinin notunun 5'lik sistemdeki değeri---> 2");
                System.out.println("Öğrenci dersten geçer not aldı.");
            }else if(ortalama>=60 && ortalama<70){
                System.out.println("Öğrencinin notunun 5'lik sistemdeki değeri---> 3");
                System.out.println("Öğrenci dersten geçer not aldı.");
            }else if(ortalama>=70 && ortalama<85){
                System.out.println("Öğrencinin notunun 5'lik sistemdeki değeri---> 4");
                System.out.println("Öğrenci dersten iyi not aldı.");
            }else if(ortalama>=85 && ortalama<=100){
                System.out.println("Öğrencinin notunun 5'lik sistemdeki değeri---> 5");
                System.out.println("Öğrenci dersten pekiyi not aldı.");
            }

        }while((not1<=0 || not1>100)||(not2<=0 || not2>100)||(finalnot<=0 || finalnot>100));

    }
}

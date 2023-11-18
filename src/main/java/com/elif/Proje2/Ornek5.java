package com.elif.Proje2;

import java.util.Scanner;

public class Ornek5 {
    /*
        Kullanıcıdan (negatif bir sayı girinceye kadar) pozitif sayılar alarak
         bu sayıların ortalamasını ekrana yazdıran bir program yazınız.
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int toplam=0;
        int sayi;
        int sayac=0;

        do{
            System.out.println("Lütfen sayı giriniz..:");
            sayi=sc.nextInt();

            if(sayi>0){
                toplam +=sayi;
                sayac ++;
            }else if(sayi==0){
                System.out.println("Lütfen 0'dan farklı bir sayı giriniz.");
            }

        }while(sayi>0 );
        System.out.println("Pozitif sayıların ortalaması..:" +(toplam/sayac));

    }
}

package com.elif.Proje2;

import java.util.Scanner;
/*
    Yazılım ağacımızı oluşturcağaız. Dışarıdan bir sayı girerek kaç basamaklı olduğunu alsın.
 */
public class Ornek3 {
    public static void main(String[] args) {
        String[] dizi= {"Y","A","Z","I","L","I","M"};

        Scanner klavye=new Scanner(System.in);
        System.out.println("N Değerini Giriniz");
        int n=klavye.nextInt();
        int sayac=0;

        for(int i=0;i<=(n-1);i++){
            for(int j=1;j<(n-i);j++){
                System.out.print(" "); //Boşlukları Oluşturuyoruz
            }

            for(int k=1;k<=(2*i+1);k++){  //Harflerin Dizilmesi Gereken Yerleri Belirliyoruz

                if(sayac==7){
                    sayac=sayac-7;
                    System.out.print(dizi[sayac]);
                    sayac=sayac+1;
                }else
                {
                    System.out.print(dizi[sayac]);
                    sayac=sayac+1;
                }
            }
            System.out.println();
        }
    }
}

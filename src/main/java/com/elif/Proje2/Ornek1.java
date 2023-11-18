package com.elif.Proje2;

import java.util.Scanner;

public class Ornek1 {
    /*
        Kullanıcının girdiği sayı kadar 1 ile 6 arasında rastgele sayı üreten ve bu sayıların kaç kez üretildiğini
        ekranda gösteren programı yazınız..
     */

    private static Scanner tara;
    static void TahminEt(int N){
        int bir=0, iki=0, uc=0, dort=0, bes=0, alti=0;
        for(int i=0; i<N; i++){
            int sayi=1 + (int)(Math.random()*6);
            if(sayi==1) bir++;
            if(sayi==2) iki++;
            if(sayi==3) uc++;
            if(sayi==4) dort++;
            if(sayi==5) bes++;
            if(sayi==6) alti++;
        }

        System.out.println("1- "+ bir +" kez");
        System.out.println("2- "+ iki +" kez");
        System.out.println("3- "+ uc +" kez");
        System.out.println("4- "+ dort +" kez");
        System.out.println("5- "+ bes +" kez");
        System.out.println("6- "+ alti +" kez");
        System.out.println("gelmiştir.");
    }

    public static void main(String[] args) {
        tara= new Scanner(System.in);
        System.out.println("Bir sayı giriniz..: ");
        int N = tara.nextInt();
        TahminEt(N);
    }
}

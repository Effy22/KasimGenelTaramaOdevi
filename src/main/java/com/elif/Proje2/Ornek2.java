package com.elif.Proje2;

import java.util.Scanner;

public class Ornek2 {
    /*
        Girilen iki sayının en büyük ortak bölenini bulan (OBEB) programın kodunu yazınız.

     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s1,s2,Enk;
        System.out.println("1. Sayı...:");
        s1 = sc.nextInt();
        System.out.println("2. Sayı...:");
        s2 = sc.nextInt();

        if(s1<s2) Enk=s1;
        else Enk=s2;

        while((s1%Enk!=0) || (s2%Enk!=0)){
            Enk =Enk-1;
        }
        if(Enk==1)
            System.out.println("Sayılar aralarında asaldır.");
        else System.out.println("Obeb..: "+ Enk);
    }
}

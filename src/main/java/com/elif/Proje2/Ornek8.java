package com.elif.Proje2;

import java.util.Scanner;

public class Ornek8 {
    /*
        Girilen metnin ya da kelimenin palindrom olup olmadığını bulunuz.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz..:");
        String kelime = sc.nextLine();

        String metin = "";
        int d = kelime.length();

        for (int i = d - 1; i >= 0; i--) {
            metin += kelime.charAt(i);
        }

        if (kelime.equalsIgnoreCase(metin)) {
            System.out.println("Girilen kelime bir palindromdur.");
        }else{
            System.out.println("Girilen kelime palindrom değildir.");
        }    }
}

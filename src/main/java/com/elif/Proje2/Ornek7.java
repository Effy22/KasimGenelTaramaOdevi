package com.elif.Proje2;

import java.util.Scanner;

public class Ornek7 {
    /*
        //Bir string değeri virgülden ayıran her kelimeyi alt alta yazdıralım, split kullanmayalım.
     */

    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Lütfen virgüllerle dolu bir cümle giriniz..");
        String deger=sc.nextLine();

        for(int i=0 ; i<deger.length(); i++){
            if(deger.charAt(i)==','){
                System.out.println();
            }else{
                System.out.print(deger.charAt(i));
            }
        }
    }

}

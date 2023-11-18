package com.elif.Proje2;

import java.util.Scanner;

public class Ornek9 {
    /*
        Dışarıdan bir dizi için değer, dizi uzunluğu sayısı alan bir metot yazalım.
        dizinin içerisinde 3 karakteri geçenleri tek tek bulup bize programın sonunda çıktı versin.
     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen yazılacak dizinin kaç elemanlı olmasını istediğinizi belirtiniz..:");
        int length=sc.nextInt();
        String dizi[]=new String[length];
        String deger;

        System.out.println("Lütfen yazılacak diziye sıra ile eleman ekleyiniz...:");
        System.out.println();

        for(int i=0;i<length; i++){
            System.out.println("Lütfen "+ (i+1) +" numaralı elemanı diziye eklemek için bir kelime girin.");
            deger=new Scanner(System.in).nextLine();
            dizi[i]=deger;
        }

        //diziyi dönmemiz lazım; ve bunu sout ile çıktı vereceğiz.
        System.out.println("Dizinin elemanları arasında 3 içeren değerler...:");

        for(int i=0; i<length; i++){
            if(dizi[i].contains("3")){
                System.out.println(dizi[i]);
            }
        }

    }
}

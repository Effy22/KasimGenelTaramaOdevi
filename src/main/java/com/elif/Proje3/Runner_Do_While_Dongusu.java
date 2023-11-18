package com.elif.Proje3;

import java.util.Scanner;

public class Runner_Do_While_Dongusu {
    /*
        İşlemlerin ne kadar tekrarlanacağının baştan beli olmadığı ancak bir koşulun doğru ya da
        yanlış olmasına bağlı olarak tekrar sayısının belirlendiği bu döngüleri; koşul kontrolünün yapıldığı
        yere göre while veya do-while olmak üzere ikiye ayırabiliriz.

        WHILE döngüleri--> Koşul kontrolünün döngünün başılda yapıldıüı yapılardır.

        DO WHILE döngüleri--> Koşul kontrolünün döngünün sonunda yapıldığı yapılardır. Döngü içerisine bir
        defa girildikten sonra koşul kontrolü yapılır. Koşulun doğru ya da yanlış olmasına göre de işlemler tekrarlanır.

        Döngünün başında ya da sonunda koşul kontrolü yapılmasının farkı;
        do while döngüsünde kod bloğu denetleme yapmadan en az 1 kere çalışmış olur.

        while ve for döngüleri ile yapılan bazı tes sonuçlarına göre (Ref: https://stackoverflow.com/questions/1165457/java-for-loop-vs-while-loop-performance-difference)
        while döngüsü, aynı amaçta yazılan bir for döngüsü kodu ile kıyaslandığında, çalışma
        performansının çok düşük bir farkla daha hızlı olduğu görülmüştür.
     */
    public static void main(String[] args) {
        //DO WHILE DÖNGÜSÜ
        System.out.println("Lütfen bir limit giriniz..: ");
        int a=new Scanner(System.in).nextInt();
        do{
            a=a+1;
        }while(a<=3); //bu koşul gerçekleşene kadar döngü tekrarlanır.


        //WHILE DÖNGÜSÜ

        System.out.println("Lütfen bir limit giriniz..: ");
        int sayi=new Scanner(System.in).nextInt();
        int i=0;
        int toplam=0;

        while(i<=sayi){
            toplam +=sayi;
            i++;
        }

    }



}

package com.elif.Proje5;
import static com.elif.Proje5.TurkceString.*;

public class Runner {
    public static void main(String[] args) {
        ifade="Sınava HAZIRLIK amaçlı soru çözüyorum.";
        karakterAl(3);
        System.out.println(ingilizceKarakterlereCevir(ifade));
        System.out.println(karakterleriKucult(ifade));
        System.out.println(karakterleriBuyut(ifade));
        System.out.println(karakterAl(5));
        System.out.println(indexBul("I"));
        System.out.println(altIfade(7,15));
        System.out.println(karakterleriDegistir("a","x"));

        ifade="Bu ifadeyi değiştiriyorum.";
        System.out.println(ifade);
        System.out.println(karakterleriBuyut(ifade));
        System.out.println(ingilizceKarakterlereCevir(ifade));

    }
}

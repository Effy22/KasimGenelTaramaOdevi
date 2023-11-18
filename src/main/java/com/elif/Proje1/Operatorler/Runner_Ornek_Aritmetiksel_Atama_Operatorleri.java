package com.elif.Proje1.Operatorler;

public class Runner_Ornek_Aritmetiksel_Atama_Operatorleri {

    public static void main(String[] args) {
        //AKTARMA OPERATÖRÜ =
        String ifade1="Elif";
        System.out.println("İlk ifade : "+ifade1);
        String ifade2="Gür";
        ifade1=ifade2;
        System.out.println("Değişen ifade : " +ifade1);

        //TOPLA VE AKTAR +=
        int a=20;
        System.out.println("Aktarmadan önceki değer..: " +a);
        a +=10;
        System.out.println("Aktarmadan sonraki değer..: " +a);

        //ÇIKAR VE AKTAR -=
        int b=20;
        System.out.println("Aktarmadan önceki değer..: " +b);
        b -=10;
        System.out.println("Aktarmadan sonraki değer..: " +b);

        //ÇARP VE AKTAR +=
        int c=20;
        System.out.println("Aktarmadan önceki değer..: " +c);
        c *=5;
        System.out.println("Aktarmadan sonraki değer..: " +c);

        //BÖL VE AKTAR /=
        int d=20;
        System.out.println("Aktarmadan önceki değer..: " +d);
        d /=5;
        System.out.println("Aktarmadan sonraki değer..: " +d);

        //MOD AL VE AKTAR %=
        int e=20;
        System.out.println("Aktarmadan önceki değer..: " +e);
        e %=5;
        System.out.println("Aktarmadan sonraki değer..: " +e);

    }
}

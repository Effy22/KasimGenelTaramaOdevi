package com.elif.Proje1.Operatorler;

public class Runner_Ornek_Mantiksal_Operatorler {
    public static void main(String[] args) {
        //MANTIKSAL VE (AND)
        int s1=4, s2=3;
        System.out.println("iki koşul da doğru ise true döner: "+ (s1<5 && s2<6));
        System.out.println("iki koşuldan birisi bile yanlış olsa false döner: " +(s1<5 && s2<1));

        //MANTIKSAL VEYA (OR)
        System.out.println("iki koşul da yanlış ise false döner: "+ (3<2 || 7<6));
        System.out.println("iki koşuldan birisi bile doğru olursa true döner " +(4<5 || 0<1));

        //DEĞİL (NOT)
        System.out.println("Yanındaki ifadenin değil'ini (tersini) alan mantıksal operatördür:");
        System.out.println(! false);
    }
}

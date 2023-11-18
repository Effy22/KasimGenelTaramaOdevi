package com.elif.Proje5;

public class TurkceString extends StringClass {

    public static String ifade;

    public static String karakterAl(int index){
       char karakter= ifade.charAt(index);
       return Character.toString(karakter);
    }
    public static int indexBul(String karakter){
        char karakterChar= karakter.charAt(0);
        return ifade.indexOf(karakterChar);
    }

    public static String altIfade(int baslangic, int bitis){
     return ifade.substring(baslangic,bitis);
    }

    public static String ingilizceKarakterlereCevir(String ifade){
        char turkceKarakterler []={'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'};
        char ingilizceKarakterler []={'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};

        for(int i=0; i<ifade.length(); i++){
            for(int j=0; j<turkceKarakterler.length; j++){
                if(ifade.charAt(i)==turkceKarakterler[j]){
                    ifade = ifade.replace(ifade.charAt(i),ingilizceKarakterler[j]);
                }
            }
        }
        return ifade;
    }

    public static String karakterleriBuyut(String ifade){
        ifade=ifade.toUpperCase();
        return ifade;
    }

    public static String karakterleriKucult(String ifade){
        ifade=ifade.toLowerCase();
        return ifade;
    }
    public static String karakterleriDegistir(String karakterEski, String karakterYeni){
        char a = karakterEski.charAt(0);
        char b = karakterYeni.charAt(0);
        return ifade.replace(a,b);
    }

}

package com.elif.Proje6;

public class Hayvan {
    public String isim;
    public String renk;
    public String tur;
    public int yasamSuresi;
    public int agirlik;
    public String beslenmeSekli;
    public void beslenme(){
        System.out.println(isim + " adlı hayvan beslendi.");
    }

    public void tuvalet(){
        System.out.println(isim + " adlı hayvan tuvaletini yaptı.");
    }

    public Hayvan() {
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "isim='" + isim + '\'' +
                ", renk='" + renk + '\'' +
                ", tur='" + tur + '\'' +
                ", yasamSuresi=" + yasamSuresi +
                ", agirlik=" + agirlik +
                ", beslenmeSekli='" + beslenmeSekli + '\'' +
                '}';
    }

    public Hayvan(String isim, String renk, int yasamSuresi) {
        this.isim = isim;
        this.renk = renk;
        this.yasamSuresi = yasamSuresi;
    }

    public Hayvan(String isim, String renk) {
        this.isim = isim;
        this.renk = renk;
    }

    public Hayvan(String isim, String renk, String tur, int yasamSuresi, int agirlik, String beslenmeSekli) {
        this.isim = isim;
        this.renk = renk;
        this.tur = tur;
        this.yasamSuresi = yasamSuresi;
        this.agirlik = agirlik;
        this.beslenmeSekli = beslenmeSekli;
    }
}

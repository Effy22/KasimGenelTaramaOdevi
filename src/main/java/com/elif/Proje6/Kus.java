package com.elif.Proje6;

public class Kus extends OmurgaliHayvan {

    public boolean sesTaklitVarMi;
    public int ucusHizi;

    public Kus(String isim, String renk,boolean sesTaklitVarMi, int ucusHizi) {
        super(isim, renk);
        this.sesTaklitVarMi=sesTaklitVarMi;
        this.ucusHizi=ucusHizi;
    }

}

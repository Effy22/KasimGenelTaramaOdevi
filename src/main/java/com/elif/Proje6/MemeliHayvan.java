package com.elif.Proje6;

public class MemeliHayvan extends OmurgaliHayvan{
    public MemeliHayvan(String isim, String renk) {
        super(isim, renk);
    }

    public void yavrusunuBesleme(){
        System.out.println( this.isim +" adlı hayvan yavrusunu sütle besledi.");
    }

}

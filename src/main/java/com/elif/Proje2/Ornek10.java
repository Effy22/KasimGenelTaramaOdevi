package com.elif.Proje2;

public class Ornek10 {
    /*
        Bir dizide ardarda gelen 2 indexteki sayı değeri 2 ise true yazdırıp döngüyü sonlandıralım yoksa
         * false yazdıralım.
     */
    public static void main(String[] args) {
        int [] sayilar={2,3,16,1258,5,2,2};

        boolean ardarda=false;

        for(int i=0; i<sayilar.length-1; i++){
            if(sayilar[i]==sayilar[i+1]){
                ardarda= true;
            }else{
                ardarda=false;
            }
        }

        System.out.println(ardarda);
    }
}

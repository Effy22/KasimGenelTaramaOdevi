package com.elif.Proje3;

public class Runner_For_Dongusu {
    /*
        Tekrar sayısının baştan belli olduğu döngülerde en güzel örnek for döngüleridir.
        Birden fazla tekrarlanacak işlem olduğunda for döngüsünü kullanırız.
        başlangıç, bitiş, değişme koşulu koyduğumuz for döngüsünde kural doğru olduğu sürece kod
        bloğu içerisinde yazılan kod yazılmaya devam eder.
        İç içe döngüler yazmamız gerektiğinde oldukça kullanışlıdır. Basit bir for döngüsü en iyi
        performansı sağlasa da diğer döngü yöntemleri çok daha iyi okunabilirlik sağlar.

        For'un bir başka kullanımı da aşağıdaki örnekteki gibi foreach döngüsüdür;
        yazım şekli ve örnek belirtilmiştir.

        for(veri tipi degisken_Adi: dizi_Adi){
            kod bloğu
        }
        Dizilerden elemanları tek tek çekmemizi sağlayan for each döngüsü kullanımı herhangi bir
        performans kaybı yaşatmaz. Aslında dizi indeksinin sınırını yanlızca birkez hesapladığından bazı
        durumlarda sıradan bir for döngüsüne göre hafif bir performans avantajı sunabilir.

        Genel olarak döngüler genellikle performans açısından kritik bölümlerdir. Gereksi yenilemeleri
        en aza indirerek, döngüler içindeki yöntem çağrılarından kaçınarak ve döngü koşullarını ve sınırlarını
        optimize ederek döngülerin verimli olmasını sağlayabiliriz.
     */
    public static void main(String[] args) {
    //FOR DÖNGÜSÜ ÖRNEĞİ
        for(int i=1; i<11; i++){
            System.out.println(i+" defa adımı yazıyorum..: Elif");
        }

        //FOR EACH DÖNGÜSÜ ÖRNEĞİ

        int dizi[]={1,2,3,4,5,7};
        for(int sayi: dizi){
            System.out.println(sayi+ " ");
        }
    }
}

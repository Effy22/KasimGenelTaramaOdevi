package com.elif.Proje1.Degiskenler;

public class Ilkel_Veri_Tipleri_Konu {
    /**
     * İlkel veri tipleri Tamsayı, Ondalıklı sayılar, karakter ve boolean olarak tanımlayabiliriz.
     *
     * ---TAMSAYI SAKLAYAN VERİ TİPLERİ---
     * --byte TİPİ--
     * 8 bit boyutundadır. -128'den itibaren 127 tamsayısına kadar değer alabilir.
     *
     * --short TİPİ--
     * 16 bit boyutundadır. -2^15 (-32768) ile  2^15-1 (32767) arasındaki değerleri alır.
     *
     *  --int TİPİ--
     * 32 bitten oluşur ve -2^31 (-2147483648) ile 2^31-1 (2147483647) arasındaki sayılar için kullanılır.
     * Bilinçsizce orta ölçekli yazılımlarda çokça kullanıldığı görülmektedir.
     *
     * --long TİPİ--
     * long: 64 bitten oluşur. Tamsayı cinsinden en büyük veri tipidir.
     * Yazılırken değerin sonuna L yazılması zorunludur. L yazılmazsa int tipinde algılanır.
     *
     * --float TİPİ--
     * float: 32 bitten oluşan ondalıklı veri tipidir. Küçük sayılarda sonunda f koymak zorunlu değildir
     * ama büyük sayılarda koyulması gerekmektedir. Sayının sonuna f koyulmadığı zaman long’da olduğu gibi hata verir.
     *
     * --double TİPİ--
     * double: 64 bitten oluşan ondalıklı veri tipidir. Çok büyük sayılar için kullanılır. float veri tipinde olduğu
     * gibi küçük sayılarda sonuna d koyulmasa da olur ama büyüklerde koyulması zorunludur. double veri tipi float veri
     * tipinden daha büyük olduğu için double tanımlarken sonuna f koysanız sayı float veri tipinin gerekli aralığına
     * girdiği sürece hata vermez.
     *
     * --char TİPİ--
     * char: 16 bit uzunluğundadır ve sadece tek bir unicode değeri(karakter) barındırabilir. Harf, sayı, nokta, yıldız,
     * tilda, artı işareti vb. herhangi bir karakteri barındırabilir. Değer atanırken tek tırnak içinde yazılması zorunludur.
     * Yazılım dilinde ASCII kodları önemlidir. char değişkeni içerisinde karakterleri sayılar yardımı ile tanır.
     * Hatta günümüzde emojiler bile ASCII kodlarının içerisine gizlenmiştir.
     *
     * --KODLAMADA DEFAULT ALGILANAN DEĞERLER--
     * Java yazılan tamsayıları otomatik olarak integer, ondalıklı sayıları double, tırnak içerisindeki metinsel ifadeleri
     * String, tek tırnakla olan karakterleri ise char olarak algılar.
     * Veri tiplerini CAST işlemi ile birbirine çevrilebiliriz.
     *
     *
     * ---İLKEL VERİ TİPLERİNİN DEFAULT DEĞERLERİ--
     * Tamsayı, Ondalıklı sayı tipinde ilkel veri tipler için varsayılan (default) değer 0'dır.
     * Boolean ilkel tipinde bir değişkenin ise default değeri false'tur.
     * Karakter (char) için \u0000,
     * Ondalıklı tip float için 0.0f, double için ise 0.0d'dir.
     *
     *
     *
     */
}

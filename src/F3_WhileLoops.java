public class F3_WhileLoops {
    public static void main(String[] args) {


        // while(true) { kod } // koşul sağlandığı süre boyunca tekrarlı işlem yapılır

        int sayac = 0;

        while (sayac <= 5) {
            System.out.println("Sayac -> " + sayac);
            sayac++;
        }

        // rastgele üretilen bir sayının 5' bölümünden sıfır kalanı verene kadar çalışan kod bloğu
        // rastgele bir sayı üretip sayının 5 bölünmesini istiyoruz
        // 0.255 ile 1 arasında sistem tarih saatin baz alarak bir ondalık değer üretir.
        int rastgeleSayi = (int)(Math.random() * 101); // 0 ile 100 arasında rastgele bir değer seçer
        System.out.println("Yeni Sayı1 ->"   + rastgeleSayi);

        while (rastgeleSayi % 5 != 0){
            rastgeleSayi = (int)(Math.random() * 101);
            System.out.println("Yeni Sayı2 ->"   + rastgeleSayi);
        }

        System.out.println("Sonuc ->"  + rastgeleSayi);



    }
}

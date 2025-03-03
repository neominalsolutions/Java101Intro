public class F1_Loops {
    public static void main(String[] args) {
        // Döngüler yazılımda tekrarlı yapılan işlemlerin berlirli bir sayıda belilir bir koşula göre tekrar çalıştırılmasını sağlayan kod bloklarıdır.
        // aynı kodun defalarca kez belirli bir koşula göre tekrar etmesi

        // bir yazılım aynı adımlardan geçerek üretim sağlamasını döngüler ile yaparız
        // NOT: araç fabrikaları, tv beyaz eşya fabrikaları

        // for döngüsü
        // while döngüsü
        // do while döngüsü
        // forin foreach döngüsü => OOP programlarda tercih ettiğimiz bir döngü tipi

        // örn: 0 ile 5 arasındaki sayıların toplamını ekrana yazdıran programın algoritması

        // 0 + 1 + 2 + 4 + 5
        // <= de dahil olsun
        int toplam = 0;

        // int i = 0; döngüdeki değişkenin başlangıç değeri
        //  i <= 5; döngünün koşulu
        // i++ ; her bir dönüşte i sayısını 1 arttır ki i 5 ten büyük olunca döngüden çıksın

        for (int i = 0; i <= 5; i++) {
            // toplam= toplam + i;
            System.out.println("i sayısı: " +  i);
            toplam+=i;
            System.out.println("Toplam Şuan ->" + toplam);
        }

        System.out.println("Toplam : (0-5)->" + toplam);



    }
}

public class C1_Operators {
    public static void main(String[] args) {
        // Comparison Operators > buyuk < kucuk == eşit != eşit değil, >= büyük veya eşit,  <= kucuk veya eşit,
        // Arithmetic Operators , +,-,*,/, ++, --, +=2
        //  && ve, || veya ! (Logical Operators)
        // Assignment Operators =,+=, *=, /=

        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3 = 3;

        // her iki koşul sağlandığında
        boolean sonuc1 =  (sayi2 > sayi1) && (sayi2 < sayi3); // true

        // NOT BIRINCI KOŞUL SAĞLARSA IKINCI KOŞULA BAKMAZ, SAĞLANMAZ ISE IKINCI KOŞUL UYARSA YINE TRUE DÖNER
        boolean sonuc2 = (sayi1 > sayi2) || (sayi2 > sayi3); // true

        boolean sonuc3 = sayi1 == sayi2; // false
        boolean sonuc4 = sayi3 != sayi3; // true
        boolean sonuc5 = sayi3 >= sayi2; // büyük veya eşit mi  true

        int sayac = 0;

        // (++sayac) bulunduğu satırda değeri 1 artırır, (sayac++) değeri bir sonraki satırda günceller.
        System.out.println("sayac1: " + (++sayac)); // 1
        System.out.println("sayac2: " + (sayac++)); // 1

        sayac = sayac + 1; // güncel sayac 2 => 3
        System.out.println("sayac3: " + sayac); // 3

        sayac +=2;
        System.out.println("sayac4: " + sayac); // 5

        sayac = sayac - 1;
        System.out.println("sayac5: " + sayac); // 4

        System.out.println("sayac6: " + (--sayac)); // 3

        System.out.println("sayac7: " + (sayac--)); // 3

        System.out.println("sayac8: " + sayac); // 2

        sayac*=2; // 4 sayac = sayac * 2; kısa versiyonu.
        System.out.println("sayac9: " + sayac); // 4

        String sonuc6 = (sayac == 4 ? "değer 4":"sonuc 4 değil");
        System.out.println("sonuc6: " + sonuc6);

        // ternary if
        // String sonuc = kosul (true yada false) ? "true durum":"false durum"
        int sonuc7 = 4 % 2 == 0 ? 1 : 2; // 4'ün 2 bölümğnden kalan sıfır ise sonuc 1 değil ise sonuc 2 olsun.

    }
}

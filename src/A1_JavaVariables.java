public class A1_JavaVariables {
    public static void main(String[] args) {

        // primative types ilkel veri tipleri veya non-primative types
        // primative types (numeric types,string types,boolean types)
        // numeric olanlar ise kendi içinde 2'ye ayrılır. Bunlar 1) tam sayı veri tipleri 2)ondalık sayı veri tipleri
        // TAM SAYI TIPLER BYTE,SHORT,INT,LONG
        // BIT 0 veya 1 -> 00010011 -> 8 bit bir karakter veya rakam.
        // BYTE 8 bit yer kaplar
        // SHORT 16 bit
        // INT 32 bit
        // LONG 64 bit

        byte yas = 80; // -128 +127
        // byte yas1 = -129;
        short $stokDegeri = 15000;
        int _likeSayisi = 150000000;
        long goruntulemeSayisi = 15000000000L;


        // KUSURATLI IFADELERE AIT TIPLER
        // FLOAT, 32 bit
        // DOUBLE 64 bit
        // Çok daha fazla küsüra hasssasiyeti aranırsa FLOAT yerine DOUBLE tercih edilir
        float zamOrani = 0.25f;
        double piSayisi = 3.14159265359d;

        // METINSEL IFADE TIPLERI
        char c = 'c'; // karakter temsili için tek tırnak 16bit
        String ad = "ALI";  // "" çift tırnak kullanırız. 16bit x karakter_sayisi 48bit
        String soyad = null; // eğer bir değer null ifadesi tanımlanabiliyorsa bu değişken primative bir değişken olmaz.

        boolean evetMi = true; // 0 veya 1 yani 2 li sayı sistemindeki açık devre 1 kapalı devre 0 olarak bir karar durumunu temsil eder.

    }
}

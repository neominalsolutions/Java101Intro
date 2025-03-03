import java.text.MessageFormat;

public class G1_Methods {
    public static void main(String[] args) {
        mesajYaz("Mesaj1");
        mesajYaz("Mesaj2");
        mesajYaz("Mesaj3");

        int sonuc =  topla(5,10); // değer döndüren return eden çağırımda bir değeri almamızı sağlar.
        mesajYaz("Sonuc : " + sonuc);
        // numeric bir ifadeyi String.valueOf(sonuc) ile String formatında göstermek için kullanılır.
        mesajYaz("Sonuc : ", String.valueOf(sonuc));

        double sonuc2 = topla(5.2,7.5); // ondalık değer toplamak için ise double olan parametreli halinden yararlandık.

       System.out.println(adSoyad( "  Mert ","  aLptEkin "));

    }

    //  ali , cAN -> ali CAN
    public  static  String adSoyad(String ad, String soyad) {
        // String methdolardan yarlandık
        return ad.trim().concat(" ").concat(soyad.trim().toUpperCase());
    }



    // mesajYaz -> method ismi
    // void -> değer döndürmez hesaplama yapmaz sadece bir eylem console üzerinden okuma yazma
    // String mesaj -> parametre dışarıdan methoda gönderilen input değeri
    public  static  void mesajYaz(String mesaj) {
        System.out.println(mesaj);
    }

    // aynı isimde farklı parametrelere sahip methodlar tanımlayabiliyoruz.
    // bu işleme method overload işlemi diyoruz.
    public  static  void mesajYaz(String mesaj1, String mesaj2) {
        // ekrana + ile metin birleştirme yapmak yerine formatlı mesaj yazmak için kullanabiliriz.

     String mesaj = MessageFormat.format("ilk Mesaj {0}, ikinci mesaj {1}",mesaj1,mesaj2); // mesajı formatlamak için
     System.out.println(mesaj); // ekrana yazdır.
    }

    public  static  int topla(int sayi1,int sayi2) {
        // method scope
        return  sayi1 + sayi2;
    }

    public  static double topla(double sayi1,double sayi2) {
        return sayi1 + sayi2;
    }
}

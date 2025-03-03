import java.util.Scanner;

public class E2_ArraySamples {
    public static void main(String[] args) {

        // kullanıcının belirlediği eleman sayısı kadar bir meyve dizisi oluşturulalım
        // kullanıcı tek tek diziye meyve eklesin
        // eklenilen meyvenin aynısı varsa kullancıya bir hata verilsin. aynı meyve eklenemez diye
        // dizideki eleman sayıları dolduğunda ise meyveler ekrana yazılsın.


        Scanner sc = new Scanner(System.in);
        System.out.println("Meyve sayısı giriniz");
        int meyveSayisi = sc.nextInt();

        String[] meyveler = new String[meyveSayisi];

//        // dizideki değerleri boş string hale getiriyoruz.
        for (int i = 0; i < meyveSayisi; i++) {
            meyveler[i] = "";
        }

        // Not: döngülerin içinde break ve continue denilen iki tane özel operatör kullanımı var.
        // break -> döngüden çıkmamızı sağlar
        // contine -> döngü içinde ike aşağıdaki kodlara bakmadan kodu yukarıya döndürüp bir sonraki adım direkt olarak geçer.

        // i dizisi ["elma","armut","muz"]
        // j dizisi ["elma","armut","muz"] j ile i aynı dizi

        for (int i = 0; i < meyveler.length; i++) {

            System.out.println((i + 1) + ". meyveyi giriniz");
            String suankiMeyve = sc.next(); // diziye ekranda girilen değeri aktar
            System.out.println(suankiMeyve);

            // meyveler dizisinde acaba suanki meyve var mı kontrolü
            for (int j = 0; j < meyveler.length; j++) {

                if (meyveler[j].isEmpty()) {
                    meyveler[i] = suankiMeyve;
                    break;
                } else {

                    if (meyveler[j].equals(suankiMeyve)) {
                        i--; // döngüde yanlış oldu tekrar aynı yeri dönsün diye yaptık
                        System.out.println("Meyve mevcut");
                        break;
                    }
                }
            }
        }

        // tüm meyveleri ekrana yazdırma
        for (int i = 0; i < meyveler.length; i++) {
            System.out.println(meyveler[i]);
        }
    }
}

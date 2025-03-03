public class E1_Arrays {
    public static void main(String[] args) {
        // aynı tipte birden fazla değerin bir arada tutulmasını sağlayan yapılar

        // numeric dizilerde dizideki eleman bir değer ataması yapılmadığı durumda 0 olarak kabul edilir
        int[] numaralar = new int[10]; // burdaki 10 ifadesi dizinin eleman sayısını kapasitesini verir.
        numaralar[0] = 3; // dizilerde indeks kavramı verinin dizi içerisindeki konumunu belirler
        // indekler 0 dan başladığında 10 elemanlı bir dizinin son elemanı 9.indeksidir.
        int elemanSayisi = numaralar.length;
        numaralar[numaralar.length - 1] = 25; // sağdan sola doğru dizinin indeksincisine atama yapılıyor.

        // diziler sıfırıncı elemandan başladığı için 0. indeksten başla numaralar.length kadar git
        for (int i = 0; i < numaralar.length; i++) {
            System.out.println("elemanın değeri ->"  + numaralar[i]);
        }


        String[] kisiler = new String[5];
        kisiler[0]= "Ali";
        kisiler[1]= "Ahmet";
        // kisiler[2]= "Can"; // String default olarak ne değer verir ?
        kisiler[3]= "Mustafa";
        kisiler[4]= "Mert";
        // kisiler[5] = "Hakan"; // eğer dizideki kapasite sınırını aşarsam ne olur.

        // Not: String dizilerinde default değer null olarak verilir.
        // dizideki eleman sayısı kadar dönüp dizideki değerleri okuyabiliriz.
        for (int i = 0; i < kisiler.length; i++) {
            System.out.println("Kisi ->"  + kisiler[i]);
        }

        // Sonuç -> Aynı tipte verilerin bir arada tutulduğu yapılara biz dizi diyiyoruz.
    }
}

public class B1_TypeCasting {
    public static void main(String[] args) {
        // bir tipin başka bir tipe dönüşmesi olayına casting diyoruz

        // Not1: tam sayı bir ifade ondalık ifadeye direkt olarak dönüşebilir
        int sayi1 = 10;
        double sayi2 = sayi1; // 10.0

        // Not:2 ondalık bir ifade tamsayı bir ifadeye dönüşürken casting ile açıkça belirtilmeldir.
        double sayi3 = 10.5;
        // int sayi4 = sayi3; 10 burda 0.5 değer kaybı olacağından program bunu izin vermiyor
        int sayi4 = (int) sayi3; // bu işleme casting ismini veririz.


        byte not1 = 75;
        byte not2 = 85;
        byte finalNot= 92;
        // eğer tamsayı tipinde değeri çıkarmak istiyorsa cast etmeliyiz
        byte notOrtalamasi = (byte) ((((float) (not1 + not2) / 2) *0.40f) + (finalNot * 0.60f));

        // YADA CAST ETMEDEN KUSURATLI KULLANMALIYIZ
        float notOrtalamasi2 =  (((float) (not1 + not2) / 2) * 0.40f) + (finalNot * 0.60f);

    }
}

import java.util.Scanner;

public class A1_Samples {
    public static void main(String[] args) {
        // kullanıcıdan alınan v1,v2 ve final notuna göre kişinin not ortlamasını hesaplayan program

        // KULLANICIDAN PROGRAM IÇIN DEĞER ALMA (1.INPUT)
        Scanner sc = new Scanner(System.in);
        System.out.println("Adınızı giriniz");
        String ad = sc.nextLine(); // metinsel bir ifade olarak aldık


        System.out.println("V1 notunu giriniz");
        byte vize1 = sc.nextByte();

        System.out.println("V2 notunu giriniz");
        byte vize2 = sc.nextByte();

        System.out.println("final notunu giriniz");
        byte finalNotu = sc.nextByte();

        // ONPROCESS HESAPLAMA ALGORITMA (2)
        // Tamsayı değerleri ondalık değerler ile çarpma bölme yaparken sonuç ondalık değer çıkar.
        float ortalama = (((vize1 + vize2) /2) * 0.40f) + finalNotu * 0.60f;

        // Metin birleştirme ile ekrana çıkacak metni formatladım.
        // HESAPLAMA SONUCUNU KULLANICIYA ÇIKTI OLARAK VERME (Output 3)
        System.out.println(ad + " adlı kişinin not ortalaması: " + ortalama + "'dur");


    }
}

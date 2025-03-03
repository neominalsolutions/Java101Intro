import java.util.Scanner;

public class F2_LoopsSample {
    public static void main(String[] args) {

        // kullanıcının girdiği iki sayısal ifade arasındaki 3'e bölünen sayıları bulup ekrana yazdıran algoritmayı yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı giriniz"); // 25
        int sayi1 = input.nextInt();

        System.out.println("İkinic sayıyı giriniz"); // 100
        int sayi2 = input.nextInt();

        int baslangic= 0;
        int bitis = 0;

        if(sayi1 > sayi2){
            baslangic = sayi2;
        }
        else {
            baslangic = sayi1;
        }

        if(sayi1 < sayi2){
            bitis = sayi2;
        }
        else  {
            bitis = sayi1;
        }

        System.out.println("Başlangic ->" + baslangic);
        System.out.println("Bitiş ->" + bitis);

        // 2 baslangic 25
        // 2 % 3 == 0 ?
        // 3 % 3 == 0
        // 4 % 3 == 0
        for(int i = baslangic; i <= bitis; i++){
            if(i % 3 == 0){
                System.out.println("3'bölünür Sayi " + i);
            }
        }



    }
}

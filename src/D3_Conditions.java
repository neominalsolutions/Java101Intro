import java.util.Scanner;

public class D3_Conditions {
    public static void main(String[] args) {
        // girilen 3 adet sayının biririne olan durumunu ekrana yazdıran programın algoritmasını yazalım
        // Not: sayılar birbirine eşit olabilir veya birbirinden büyük olabilir, veya birbirinden küçük olabilir bu durumda en büyük ve en küçük değeri bulan programın kodunu yazalım. eşitlik varsada sayılar arasındaki eşitliği ekrana yazdırsın.
        //10 12 22;  22 => En Büyük 10 => En küçük
        // 10 10 10 => Bütün sayılar birbirlerine eşit
        // 10 12 12 => sayi2 ile sayi3 birbirine eşit

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Sayı giriniz");
        int sayi1 = sc.nextInt();

        System.out.println("2.Sayı giriniz");
        int sayi2 = sc.nextInt();

        System.out.println("3.Sayı giriniz");
        int sayi3 = sc.nextInt();

        // eşitlik durumlarının kontrolü
        if(sayi1 == sayi2 && sayi1 == sayi3){
            System.out.println("Tüm sayılar birbirlerine eşit");
        }
        else if(sayi1 == sayi2){
            System.out.println("Sayi1 ve Sayi2 birbirine eşit");
        }
        else if(sayi1 == sayi3){
            System.out.println("Sayi1 ve Sayi3 birbirine eşit");
        }
        else  if(sayi2 == sayi3){
            System.out.println("Sayi2 ve Sayi3 birbirine eşit");
        }
        else { // eşitlik olmadığında
            System.out.println("Tüm sayılar birbirinden farklı");

            // sayılar eşit değil ise sayıların birbirinden büyük yada küçük olma durumunu bulma
            // iç içe if diyoruz
            if(sayi1 > sayi2){
                System.out.println("Sayi1 > Sayi2");
            }
            else {
                System.out.println("Sayi2 > Sayi1");
            }

            if(sayi2 > sayi3){
                System.out.println("Sayi2 > Sayi3");
            }
            else {
                System.out.println("Sayi3 > Sayi2");
            }

            if(sayi3 > sayi1){
                System.out.println("Sayi3 > Sayi1");
            }
            else {
                System.out.println("Sayi1 > Sayi3");
            }


            if(sayi1 > sayi2 && sayi1 > sayi3){
                System.out.println("En Büyük Sayı 1");
            }
            else if(sayi2>sayi1 && sayi2 > sayi3){
                System.out.println("En büyük sayi2");
            }
            else {
                System.out.println("En Büyük Sayı 3");
            }

            if(sayi1 < sayi2 && sayi1 < sayi3){
                System.out.println("En Küçük Sayı 1");
            }
            else if(sayi2 < sayi1 && sayi2 < sayi3){
                System.out.println("En Küçük sayi2");
            }
            else {
                System.out.println("En Küçük Sayı 3");
            }

        }
    }
}

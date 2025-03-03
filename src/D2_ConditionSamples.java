import java.util.Scanner;

public class D2_ConditionSamples {
     public static void main(String[] args) {
         // kullanıcıdan alınan köşe uzunluk değerlerine göre
         // 1 üçgenin ikizkenar, eşkenar veya çeşit kenar olduğunu bulan programın algoritmasını yazalım

         Scanner sc = new Scanner(System.in);

         System.out.println("A kenarının uzunluğunu giriniz");
         int akenari = sc.nextInt();


         System.out.println("B Kenarının uzunluğunu giriniz");
         int bKenari = sc.nextInt();

         System.out.println("C Kenarının uzunluğunu giriniz");
         int cKenari = sc.nextInt();

         if(akenari == bKenari && cKenari == bKenari) { // ve her iki koşulun doğruluğana bakar
             System.out.println("Eşkenar üçgen");
         }
         else if (akenari == bKenari || cKenari == bKenari) { // veya ise sadece bir koşulun doğruluğuna bakar
             System.out.println("İkizkenar üçken");
         }
         else {
             System.out.println("Çeşitkenar üçgen");
         }

     }
}

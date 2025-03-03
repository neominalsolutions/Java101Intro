import java.util.Scanner;

public class D1_Conditions {
     public static void main(String[] args) {

         // if(true)
         // { çalışacak kod }
         // else
         // { false ise çalışacak kod }

         // Not: birden fazla koşul durumda if,else if, else yapısını kullanırız
         // if(true)
         // {  kod }
         // else if(eğer true ise)
         // { çalışacak kod}
         // else
         // { hiçbir koşul sağlanmaz ise çalışacak kod }

         // kullanıcıdan istenen sayının tek yada çift olduğunu bulup ekrana yazan programın algoritması
         System.out.println("Bir sayı giriniz");
         Scanner sc = new Scanner(System.in);
         int sayi1 = sc.nextInt();

         if(sayi1 % 2 == 0){ // çift sayıdır 2 bölümünden sıfır kalanı verir
             System.out.println("Sayımız çiftir");
         } else {
             System.out.println("Sayımız Tek");
         }



     }
}

import java.util.Scanner;

public class C2_OperatorSample {
    public static void main(String[] args) {

        // Kullanıcınınb klavyeden girdiği bir rakama göre girilen rakamın tek yada çift sayı olduğunu bulan programın algoritmasını yazalım
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir rakam giriniz");

        int rakam = sc.nextInt(); // kullanıcıdan okunan değer
        // ternaryif if else kodunun kısa yazım hali.
        boolean ciftMi = rakam % 2 == 0; // rakamın 2'ye bölümünden kalan sıfır ise rakam çiftir.

        String mesaj = ciftMi ? "rakam çiftir":"rakam tektir";
        System.out.println("sonuç : " + mesaj);

    }

}

import java.util.Scanner;

public class E1_SwitchCase {
    public static void main(String[] args) {

        // int value = 10;
        // değişken değerinin case ifadeleri ile eşleşip eşlemediğine bakarak çoklu kararların uygun koşula göre verilmesini sağlar.
        // switch(value)
        // {
        // case 1:
        // case 2
        //    System.out.printif(1)
        //    break;
        // default:
        // System.out.print();
        // }

        // kullanıcın klavyeden girdiği ay isminin hangi mevsime karşılık geldiğini bulan programa ait kodları switch case ile yazalım.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz");
        String ay = sc.nextLine().trim().toLowerCase();
        // " Ali " => "ali"
        // " OCaK " => "ocak"

        switch (ay) {
            case "aralık": // Aralık ise veya OCak ise veya Şubat ise
            case "ocak":
            case "şubat":
                System.out.println("Kış mevisimidir");
                break;
            case "mart":
            case "nisan":
            case "mayıs":
                System.out.println("İlkbahar");
                break;
            case "haziran":
            case "temmuz":
            case "ağustos":
                System.out.println("Yaz");
                break;
            case "eylül":
            case "ekim":
            case "kasım":
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Böyle bir ay yok");
        }
    }
}

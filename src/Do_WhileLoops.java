public class Do_WhileLoops {
    public static void main(String[] args) {

//        do {
//            // do işindeki kodlar 1 kereye mahsus öncelikle çalışır daha sonra
//            // while koşulu uyduğu süre boyunca tekrar çalışır
//        } while (true);

          // final olarak işaretlenen değişkenler sadece 1 kez değer ataması yapılır daha sonradan ikinci kez değişkenin değeri değiştirilemez.
//        final double PI = 3.14;
//        PI = 3.15;

        // Math.pow(2,3);

        double number = 0.0d;

        do {

            // while da yazılan kod do içerisinde yazılır
            // tekrar eden kodlar burada yazılır
            number = Math.floor(Math.random() * 101);
            System.out.println("Sayı -> " + number);

        } while (number % 5 != 0);


        System.out.println("5.Katı Sayı -> " + number);


    }
}

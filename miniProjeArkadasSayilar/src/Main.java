public class Main {

    public static void main(String[] args) {
        //
        // arkadaş sayılar bölenlerinin toplamı birbirine eşit olan sayılardır
        // bilinen en küçük arkadaş sayı 220-284'dür
        // yani 220 nin bölenlerinin toplamı 284'e, 284'ün bölenlerinin toplamı da 220'ye eşittir.
        // (220, 284), (1184, 1210), (2620, 2924) (5020, 5564), (6232, 6368), (10744, 10856),
        // (12285, 14595), (17296, 18416), (63020, 76084)

        int arkadasSayi1 = 17296;
        int arkadasSayi2 = 18416;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int x = 1; x < arkadasSayi1; x++) {
            if (arkadasSayi1 % x == 0) {
                // System.out.println(x);
                toplam1 = x + toplam1;


            }
        }
        for (int x = 1; x < arkadasSayi2; x++) {
            if (arkadasSayi2 % x == 0) {
                // System.out.println(x);
                toplam2 = x + toplam2;
            }
        }
        if (toplam2 == arkadasSayi1) {
            if (toplam1 == arkadasSayi2) {
                System.out.println("Arkadaş Sayı!");
            }
        } else {
            System.out.println("Arkadaş Sayı değil!");
        }

        // veya daha temiz ve kısa bir kod için alttakini yazabilir


        if (toplam2 == arkadasSayi1 && toplam1 == arkadasSayi2) {

            // burada "&&"(and) operatörü kullanarak kodumuzu daha işlevsel hale getirebiliriz
            // ******** "&&" : and,  "||" : or ********

            System.out.println("Arkadaş Sayı!");
        } else {
            System.out.println("Arkadaş Sayı değil!");
        }
    }
}





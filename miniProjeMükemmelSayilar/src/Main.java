public class Main {

    public static void main(String[] args) {
        // Mükemmel sayılar bölenlerinin toplamına eşit sayılardır.
        // örneğin 6'yı bölen sayılar 1,2,3'dür ve toplamları bölünene eşittir.

        int mukemmelSayi = 28;
        int toplam = 0;

        for (int x = 1 ; x < mukemmelSayi; x++) {
            if (mukemmelSayi % x == 0) {
                // System.out.println(x); //döngüdeki sayıları görmek istersek bunu aktif edebiliriz.
                toplam = x + toplam;


            }
        }
        if (toplam == mukemmelSayi) {
            System.out.println("Mükemmel sayı!");
        } else {
            System.out.println("Sayı mükemmel değil!");
        }
    }
}

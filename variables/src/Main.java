public class Main {

    public static void main(String[] args) {

        /*
         javada değişken tanımlamak
         javada satır sonları ";" ile biter, eğer satır sonuna ";" konulmazsa kod satırı devam ettiği
         varsayılarak syntax hatası alınabilir.
         java'da büyük küçük harf duyarlılığı olduğu için yazılan kod uygun olmaz ise hata alınır
        */

        int sayi = 10;
        String ogrenci = "Öğrenci sayısı : ";

        System.out.println("öğrenci sayısı : "+ sayi);
        System.out.println(ogrenci+ sayi);

        double ondalikli = 50.3;

         /*
           double float veri tipiyle aynıdır fakat daha büyük boyuttaki sayıları
           barındırabilir. float ise daha küçük sayıları tutmak için kullanılır. bu hem bellek yönetimi
           hem de programın hızı açısından önemlidir.
           aynı durum diğer veri tipleri için de geçerlidir.
           orneğin byte < short < int < long şeklindedir.

         */

        byte bit;
        bit = 5;
        long sayi1;
        sayi1 = 254535244;

        char karakter = 'A';  // char tek bir karakteri ifade eder ve tek tırnakla ifade edilir.
                              // String yerine geçmez


    }
}




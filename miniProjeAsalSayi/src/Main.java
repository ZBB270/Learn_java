import java.util.Enumeration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayının asal olup olmadığını kontrol eden program,");
        System.out.println("10 haneye kadar bir sayı girebilirsiniz :");
        int number = scanner.nextInt();
        int remainder = number % 2; // remainder : kalan "%" ile number'ın 2 ye bölümünden kalanını verir
        boolean isPrime = true;     // isPrime : asal mı

        // System.out.println(remainder);  // istersek kalanı da yazdırabiliriz


        if (number == 1){
            System.out.println("Sayı asal değildir.");
            return;     // "return" eğer şart sağlanıyorsa fonksiyonu sonlandırmak için kullanılır.
        }
        if (number<0){
            System.out.println("Tanım gereği negatif sayılar asal sayı değildir!");
            return;
        }
        if (number==0){
            System.out.println("Lütfen bir sayı giriniz!");
            return;
        }

        for (int i = 2; i<number; i++){
            if(number % i == 0 ){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Sayı asaldır.");
        }else {
            System.out.println("Sayı asal değildir.");
        }



    }
}


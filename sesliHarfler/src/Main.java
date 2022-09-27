public class Main {

    public static void main(String[] args) {
        // Sesli - Sessiz harf uygulaması
        // a, e, ı, i, o, ö, u, ü sesli harfler

        // alternatif upperCase yapma

        // char harf = 'a' & 0x5f;

        /* >>>  '' & 0x5f '' ile karakteri büyük yapıyoruz.
           >> eğer karakter büyük veya küçük yapılmaz ise girilen karakteri tek bir tipte okumayacağından hata alabiliriz.
           >> ya da switch case de küçük harfleri de tek tek tanımlamamız gerekir. */



         char harf = 'o';

         harf = Character.toUpperCase(harf); // girilen harfi büyük harf yapıyoruz



        switch (harf) {
            case 'A':
            case 'E':
            case 'I':
            case 'İ':
            case 'O':
            case 'Ö':
            case 'U':
            case 'Ü':


                System.out.println("Sesli/Ünlü harf.");
                break;
            default:
                System.out.println("Sessiz/Ünsüz harf.");


        }
    }
}


// char harf = 'd' & 0x5f;

      /*

        How it works:

Binary, hex and decimal table:

------------------------------------------
| Binary   |   Hexadecimal     | Decimal |
-----------------------------------------
| 1011111  |    0x5f           |  95     |
------------------------------------------
| 100000   |    0x20           |  32     |
------------------------------------------
Let's take an example of small l to L conversion:

The binary AND operation: (l & 0x5f)

l character has ASCII 108 and 01101100 is binary represenation.

   1101100
&  1011111
-----------
   1001100 = 76 in decimal which is **ASCII** code of L
Similarly the L to l conversion:

The binary XOR operation: (L ^ 0x20)

   1001100
^  0100000
-----------
   1101100 = 108 in decimal which is **ASCII** code of l

         */

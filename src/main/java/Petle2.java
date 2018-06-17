import static java.lang.String.*;

public class Petle2 {

    public static void main(String[] args) {
        int[] liczby = new int[30];

       /* for (int i = 0; i < liczby.length; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("happy");
                if (i % 5 == 0) {
                    System.out.println("kitty");
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("pikachu");
                    }
                }
            }
        }

     */
        ;
       /* String tekst = "Na egzaminie nie bedzie calek";        /// zad.2   zamiana "a" na "o" ; "n" na "z" ; "e" na "x" <-  nie uzywac jako char bo nie wyjdzie tylko
        tekst = tekst.replaceAll("a","o");                       ///    tekst czyli to co jest po String i wtedy wychodzi
        tekst = tekst.replaceAll("n","z");
        System.out.println(tekst);

        */
        liczby = new int[]{1, 4, 7, 8, 11, 14, 16, 20};
        for (int i = 0; i < 20; i++) {
            boolean flaga = false;                              // sout(liczby[i])   jesli dam samo [i] bede miec cyfry : 0,1,2,3,4,5,6,7. <- wypisze po indeksie
            for (int j = 0; j < liczby.length; j++) {
                if (i == liczby[j]) {
                    flaga = true;                              // flaga to zmienna    ktora mozna roznie nazwac.
                    break;
                }
            }
                if (!flaga) {
                    System.out.println(i);
                }
            }

        }
    }














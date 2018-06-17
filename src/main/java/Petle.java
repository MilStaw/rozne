

public class Petle {
    public static void main(String[] args) {
        //  int tab[] = new int[0];
        // int min = tab[0];
        //int liczbaDoSprawdzenia;
        //  boolean czyJestPodzielna;

        /// for (int i = 1; i < 50; i++) {
        /// if (i % 5 == 0) {   ////  podzielne przez 2.
        //  if (i % 2 == 1){      ///  nie podzielne przez 2.     do zadania 2 w mailu
        ///  System.out.println(i);


        // for (int i=1; i < 30; i++);          do zadania 3 w mailu
        // for (int j=1; j < 30; j++){
        //if (j % 2 == 0) {
        // System.out.println(j);



      /*  int liczbaDoSprawdzenia = 50;   /// do zadania 4 w mailu
        boolean czyJestPodzielna = false;

        for (int i = 2; i <= 50; i++) {
            if (liczbaDoSprawdzenia % i == 0) {
                czyJestPodzielna = true;
                break;
            }
        }

        if (czyJestPodzielna == true) {
            System.out.println("jest podzielna");
        } else {
            System.out.println("jest niepodzielna");
        }
            }
        }
*/


     /*   /// 1 sposob
        int liczbaDoSprawdzenia = 49;
        int max = 0;
        for (int i = liczbaDoSprawdzenia - 1; i > 2; i--) {
            if (liczbaDoSprawdzenia % i == 0) {
                max = i;
                break;
            }
        }

        System.out.println(max);///  wypisze najmniejszy podzielnik....
    }

    ///  2 sposob
        int liczbaDoSprawdzenia = 45;
        int min = 0;
        for (int i = 2; i <= liczbaDoSprawdzenia; i++) {
            if (liczbaDoSprawdzenia % i == 0) {
                min = i;
                break;
            }
        }
        System.out.println(min);   ///   wypisze najmniejszy podzielnik
     }
     */
        int liczbaDoSprawdzenia = 45;
        int max = 0;
        for (int i = 50; i > 2; i--) {
            if (liczbaDoSprawdzenia % i == 0) {
                max = i;
                break;
            }
        }
        System.out.println(max);     //// wypisze najwiekszy podzielnik
    }
}
  /*  int i = 7;
     if (i < 0)
        {
        System.out.println("negatywne");
        }
        if (i > 0)
        {
        System.out.println("pozytywne");       // da wynik "pozytywne"
        }
        }
        */





















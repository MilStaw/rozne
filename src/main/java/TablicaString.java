

import static java.lang.Float.MIN_VALUE;

public class TablicaString {
    public static void main(String[] args) {
        String[] dane = {"Lorem", "ipsum", "pellentesque", "dolor", "sit", "amet",
                "consectetur", "adipiscing", "elit", "pellentesque", "Phasellus",
                "lacus", "metus", "dictum", "vitae", "ex", "vitae", "feugiat",
                "pellentesque", "est"};
        int max = 0;
        int index = 0;

        for (int i = 0; i < dane.length; i++) {     // w tym przypadku znajdzie 2 index
            if (dane[i].length() > max) {
                max = dane[i].length();
                index = i;
            }
        }
        System.out.println(index);
        System.out.println(dane[index]);
    }
}


/*
    int max = Integer.MIN_VALUE;
    int index = Integer.MIN_VALUE;


        for (int i = 0; i < dane.length; i++) {       // w tym przypadku znajdzie 18 index  (ostatni najwiekszy)
            if (dane[i].length() >= max) {
                max = dane[i].length();
                index = i;
            }
        }
            System.out.println(index);
            System.out.println(dane[index]);
        };

        String alphabet;
        for( int i = 'a'; i <= 'z'; i++ )
          //  System.out.println(i);          //    w ten sposob wypisze od 97 do 122
            System.out.println((char)(i));    //    w ten sposob wypisze od 'a' do 'z'   ale musi byc 'char' w nawiasie

*/


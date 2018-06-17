import java.util.Arrays;

public class Tablica {
    public static void main(String[] args) {
        Integer[] tablicaLiczb = new Integer[5];

        tablicaLiczb[0] = 1;
        tablicaLiczb[1] = 3;
        tablicaLiczb[2] = 5;
        tablicaLiczb[3] = 7;
        tablicaLiczb[4] = 11;

        System.out.println(tablicaLiczb[0]);
        System.out.println(tablicaLiczb[1]);
        System.out.println(tablicaLiczb[2]);

        System.out.println(tablicaLiczb[3]);
        System.out.println(tablicaLiczb[4]);
        int suma = 0;

        for (int i = 0; i < tablicaLiczb.length; i++) {
            suma += tablicaLiczb[i];
        }
        System.out.println(suma);
    }
}
    /*
        int[] tablica = {1, 4, 7, 3, 7, 5, 2};
            Arrays.sort(tablica);    //            <- bez tego nie posortuje
            System.out.println(Arrays.toString(tablica));
*/








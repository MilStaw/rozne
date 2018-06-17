import java.util.Arrays;

public class Rozne {
    public static void main(String[] args) {

        String tekst = "Python";
        // System.out.println(tekst.substring(0, tekst.length()/2));     // w ten sposob dzieli tekst na pol
        System.out.println(tekst.length() / 2);                           // w ten sposob dzieli tekst na pol ale pokazuje liczbe 3


        int[] a = {50, -20, 0, 30, 40, 60, 12};
        int[] b = {45, 20, 10, 20, 30, 50, 11};


        System.out.println(a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);   // to pokazyje ze pierwszy i ostatni element w tablicy nie jest taki sam


        int[] array1 = {50, -20, 0};                //  1) sposob na wypisanie  array_new = [50,10].  W ten sposob nic nie wypize
        int[] array2 = {5, -50, 10};
        System.out.println(array1);
        System.out.println(array2);
        int[] array_new = {array1[0], array2[2]};
        System.out.println(array_new);

        int[] array3 = {50, -20, 0};             //   2) sposob  ktory jest poprawny
        int[] array4 = {5, -50, 10};
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        int[] array_new1 = {array1[0], array2[2]};
        System.out.println("New Array: " + Arrays.toString(array_new));


        int[] array = {20, 30, 40};                                         // tak piszemy gdy chcemy by wyszlo : [30,40,20]
        System.out.println("Original Array: " + Arrays.toString(array));
        int[] new_array = {array[1], array[2], array[0]};
        System.out.println("Rotated Array: " + Arrays.toString(new_array));

        int[] array5 = {20, 30, 40};                                        // tak gdy trzeba odwrocic elementy
        System.out.println("Original Array: " + Arrays.toString(array));
        int x = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = x;
        System.out.println(Arrays.toString(array));


        int[] array6 = {20, 30, 40, 50, 67};
        System.out.println("Original Array: " + Arrays.toString(array));
        int max_val = array[0];
        if (max_val <= array[array.length - 1])
            max_val = array[array.length - 1];
        if (max_val <= array[array.length / 2])
            max_val = array[array.length / 2];
        System.out.println("Largest element between first, last, and middle values: " + max_val);    //tak gdy trzeba wypisac najwieksza czyli 67


        String result = "";
        int[] a1 = {1, 3, -5, 4};
        int[] b1 = {1, 4, -5, -2};
        for (int i = 0; i < b.length; i++) {    //   bez znaczenia czy a.length  czy b.length
            int num1 = a[i];
            int num2 = b[i];
            result += Integer.toString(a[i] * b[i]) + " ";
        }
        System.out.println("\nResult: " + result);         //  a tak wypisule mnozenie 2 tabel :1; 12; 25; -8
        // natomiast jesli sout bedzie w petli po kolei wypisze :                                                   1
    }                                                  //                                                           1  12
    //                                                                                                              1  12  25
    //                                                                                                              1  12  25 -8


}

 /*
        Integer x = 5;                                                                     //  toString () <-  String Zwraca wartości obiektu całkowitą.
        System.out.println(x.toString());            // tu wypisze 5                        // toString (int i) <-  Określa int Zwraca obiekt String
        System.out.println(Integer.toString(12));   // tu wypisze 12 czyli String                                                                                                   //          toString (int i): Określa int Zwraca obiekt Strin ]



    }
    */








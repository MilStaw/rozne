import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class MaleNaDuzeLitery {
    public static void main(String[] args) {

        String zmienWielkosc = "lubie swojego psa";    //    zmiana na: LUBIE SWOJEGO PSA
        System.out.println(zmienWielkosc);
        String rezult = zmienWielkosc.toUpperCase();
        System.out.println(rezult);

       /* String t = "lubie swojego psa";                                      //    <- 1) sposob      zmiana na: Lubie Swojego Psa
        final StringBuilder result = new StringBuilder(t.length());
        String words[] = t.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            if (i > 0){
                result.append(" ");
            }
            result.append(Character.toUpperCase(words[i].charAt(0))).append(
                    words[i].substring(1));
        }
        System.out.println(result);
    }*/


      /*  String firstLetterCapitalWithSingleSpace ( final String words){                          //  <- 2) sposob
            return Stream.of(words.trim().split(" "))
                    .filter(word -> words.length() > 0)
                    .map(word -> words.substring(0, 1).toUpperCase() + words.substring(1))
                    .collect(Collectors.joining(" "));
*/


        }


    }
















import java.util.Scanner;

public class Rozne2{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);                    //     1} sposob gdy wypiszemy dzien tygodnia wowczas poda ktory to dzien
        System.out.println("Podaj dzien tygodnia");
        int day = in.nextInt();
        System.out.println(getDayName(day));
    }

    public static String getDayName(int day) {
        String dayName = " ";
        switch (day) {
            case 1:
                dayName = "Poniedzialek"; break;
            case 2:
                dayName = "Wtorek"; break;
            case 3:
                dayName = "Sroda"; break;
            case 4:
                dayName = "Czwartek"; break;
            case 5:
                dayName = "Piatek"; break;
            case 6:
                dayName = "Sobota"; break;
            case 7:
                dayName = "Niedziela"; break;
        }
        return dayName;





    }
}



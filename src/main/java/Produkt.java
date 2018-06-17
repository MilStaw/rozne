import java.util.ArrayList;
import java.util.List;

 class Produkt {

     public int getCena() {
         return cena;
     }

     public void setCena(int cena) {
         this.cena = cena;
     }

     public String getNazwa() {
         return nazwa;
     }

     public void setNazwa(String nazwa) {
         this.nazwa = nazwa;
     }

     private int cena;
            private String nazwa;

     public static void main(String[] args) {
         Produkt p1 = new Produkt();    /// new Produkt: tworzy obiekt produktu.
         p1.setCena(12);
         p1.setNazwa("cebula");

         Produkt p2 = new Produkt();
         p2.setCena(5);
         p2.setNazwa("pora");

         List<Produkt>produkty = new ArrayList<Produkt>();

        produkty.add(p1);
        produkty.add(p2);

        int suma =0;
        for ( int i=0; i<produkty.size(); i++) {
            suma += produkty.get(i).getCena();      /// produkty.get(i).getCena()   zeby wyswietlic cene
        }
            System.out.println(suma);







        }






    }





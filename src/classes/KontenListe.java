package classes;

import java.util.ArrayList;

public class KontenListe {

    public static ArrayList<Konten> putProductInProductList(ArrayList<Konten> listOfKonten, String kontonummer, String name, int kontostand) {

        try {
            Konten newKonto = new Konten(kontonummer, name, kontostand);
            listOfKonten.add(newKonto);


        } catch (Exception e) {

            System.out.println("Error");
        }

        return listOfKonten;
    }

}




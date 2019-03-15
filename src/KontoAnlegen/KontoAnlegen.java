package KontoAnlegen;
import classes.Konten;
import classes.KontenListe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KontoAnlegen extends JFrame {

    public static ArrayList<Konten> listOfKonten = new ArrayList<>();

    private JTextField kontostandField;
    private JTextField nameField;
    private JTextField kontonummerField;
    private JButton erstellenButton;
    private JPanel kontoAnlegenPanel;

    public KontoAnlegen() {
        erstellenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    String kontonummer = kontonummerField.getText();
                    String name = nameField.getText();
                    String kontostand = kontostandField.getText();

                    int kontoInt = Integer.parseInt(kontostand);

                    if(!kontonummer.isEmpty() && !name.isEmpty() && !kontostand.isEmpty()){

                        listOfKonten = KontenListe.putProductInProductList(listOfKonten, kontonummer, name, kontoInt);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Bitte alle Eingaben tätigen!");
                    }

                } catch (Exception b) {
                    JOptionPane.showMessageDialog(null, "Bitte valide Werte eingeben!");
                }


            }

        });

    }
    public void KontoGuthabenAendern(int minusBetragInt, int plusBetragInt, int nummerInt, String kontonummer){

        if(listOfKonten.isEmpty()){
            JOptionPane.showMessageDialog(null, "Buchung konnte nicht verarbeitet werden");

        }else if(!listOfKonten.isEmpty() && listOfKonten.get(nummerInt - 1).getKontonummer().equals(kontonummer)) {
            listOfKonten.get(nummerInt - 1).setKontostand(listOfKonten.get(nummerInt - 1).getKontostand() + plusBetragInt - minusBetragInt);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Buchung konnte nicht tfhtverarbeitet werden");
        }

    }

    public void kontenLoeschen(int nummer, String name, String kontonummer){


        if(listOfKonten.get(nummer - 1).getName().equals(name) && listOfKonten.get(nummer - 1).getKontonummer().equals(kontonummer)) {
            listOfKonten.remove(nummer - 1);
            dispose();

        }else{
            JOptionPane.showMessageDialog(null, "Das Konto konnte nicht gelöscht werden!");
        }

    }

    public void anlegen(){

        add(kontoAnlegenPanel);
        setSize(400, 400);
        setTitle("Konto anlegen");
        setVisible(true);
    }


}

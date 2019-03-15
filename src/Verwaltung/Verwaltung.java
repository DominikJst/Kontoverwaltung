package Verwaltung;

import KontoAnlegen.KontoAnlegen;
import KontoLoeschen.KontoLoeschen;
import KontostandAendern.KontostandAendern;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static KontoAnlegen.KontoAnlegen.listOfKonten;

public class Verwaltung extends JFrame {

    private JPanel verwaltungPanel;
    private JButton kontoAnlegenButton1;
    private JButton kontostandVerändernButton;
    private JButton kontoLöschenButton;
    public JTextPane textPane1;
    private JButton verlassenButton;
    private JButton aktualisierenButton;
    StringBuilder buffer = new StringBuilder();

    public Verwaltung() {
        kontoLöschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                KontoLoeschen loeschen = new KontoLoeschen();
                loeschen.Loeschen();
            }
        });

        kontostandVerändernButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                KontostandAendern aendern = new KontostandAendern();
                aendern.kontoAendern();
            }
        });

        kontoAnlegenButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                KontoAnlegen kontoAnlegen = new KontoAnlegen();
                kontoAnlegen.anlegen();

            }
        });
        verlassenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                dispose();
                System.exit( 0 );
            }
        });
        aktualisierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(listOfKonten.isEmpty()){
                    textPane1.setText(" ");
                    JOptionPane.showMessageDialog(null, "Es sind keine Konten vorhanden!");
                }
                else {
                    buffer.delete(0,buffer.capacity());
                    for (int i = 0; listOfKonten.size() > i; i++) {
                        buffer.append((i+1) +  " " + listOfKonten.get(i).getName()+ " "+ listOfKonten.get(i).getKontonummer() + " " + listOfKonten.get(i).getKontostand() + "€").append("\n");
                    }

                    textPane1.setText(buffer.toString());
                }

            }
        });
    }

    public void Verwalter (){

        add(verwaltungPanel);
        setSize(900, 500);
        setTitle("Hauptmenue");
        setVisible(true);

    }

}

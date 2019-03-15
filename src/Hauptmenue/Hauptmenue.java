package Hauptmenue;

import Verwaltung.Verwaltung;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hauptmenue extends JFrame{
    private JButton kontoverwaltungButton;
    private JButton verlassenButton;
    private JPanel panel1;

    public Hauptmenue() {

        add(panel1);
        setSize(700, 500);
        setTitle("Hauptmenue");

        kontoverwaltungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    Verwaltung verwalt = new Verwaltung();
                    dispose();
                    verwalt.Verwalter();
            }
        });

        verlassenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                System.exit( 0 );
            }
        });
    }

}

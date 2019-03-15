package KontoLoeschen;

import KontoAnlegen.KontoAnlegen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KontoLoeschen extends JFrame {

    private JTextField nummerField;
    private JTextField nameField;
    private JTextField kontonummerField;
    private JButton loeschenButton;
    private JLabel nummerLabel;
    private JLabel nameLabel;
    private JLabel kontonummerLabel;

    private JPanel loeschenPanel;

    public KontoLoeschen() {
        loeschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String nummer = nummerField.getText();
                    String name = nameField.getText();
                    String kontonummer = kontonummerField.getText();

                    int nummerInt = Integer.parseInt(nummer);

                    if(!nummer.isEmpty() && !name.isEmpty() && !kontonummer.isEmpty()){

                        KontoAnlegen anlegen = new KontoAnlegen();

                        anlegen.kontenLoeschen(nummerInt, name, kontonummer);

                        dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Bitte valide Eingaben treffen!");
                    }


                }catch(Exception f){
                    JOptionPane.showMessageDialog(null, "Das Konto konnte nicht gelöscht werden!");
                }
            }
        });
    }


    public void Loeschen(){

        add(loeschenPanel);
        setSize(400, 400);
        setTitle("Konto loeschen");
        setVisible(true);

    }

}

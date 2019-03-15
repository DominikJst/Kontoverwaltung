package KontostandAendern;

import KontoAnlegen.KontoAnlegen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KontostandAendern extends JFrame {

    private JPanel kontostandAendernPanel;
    private JButton aendernButton;
    private JLabel kontonummerLabel;
    private JLabel minusBetragLabel;
    private JLabel plusBetragLabel;
    private JLabel nummerLabel;
    private JTextField kontonummerField;
    private JTextField minusBetragField;
    private JTextField plusBetragField;
    private JTextField nummerField;

    KontoAnlegen konto = new KontoAnlegen();

    public KontostandAendern() {
        aendernButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    String kontonummer = kontonummerField.getText();
                    String minusBetrag = minusBetragField.getText();
                    String plusBetrag = plusBetragField.getText();
                    String nummer = nummerField.getText();

                    int minusBetragInt = Integer.parseInt(minusBetrag);
                    int plusBetragInt = Integer.parseInt(plusBetrag);
                    int nummerInt = Integer.parseInt(nummer);

                    if(!kontonummer.isEmpty() && !minusBetrag.isEmpty() && !plusBetrag.isEmpty() && !nummer.isEmpty()){

                        konto.KontoGuthabenAendern(minusBetragInt, plusBetragInt, nummerInt, kontonummer);

                        dispose();

                    }else{
                        JOptionPane.showMessageDialog(null, "Bitte valide Eingaben treffen!");
                    }


                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, "Kontostand konnte nicht geändert werden!");
                }
            }
        });

    }


    public void kontoAendern(){

        add(kontostandAendernPanel);
        setSize(400, 400);
        setTitle("Kontostand aendern");
        setVisible(true);
    }

}

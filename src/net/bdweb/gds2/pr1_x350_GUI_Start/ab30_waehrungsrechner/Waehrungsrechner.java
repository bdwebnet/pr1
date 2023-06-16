package net.bdweb.gds2.pr1_x350_GUI_Start.ab30_waehrungsrechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Waehrungsrechner extends JFrame implements ActionListener {

    ArrayList<JTextField> textFields = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("0.00");

    public Waehrungsrechner () {
        super("Waehrungsrechner");

        setDefaults();

        addNumberInput("Betrag in Singapurdollar", "singapurdollar");
        addNumberInput("Betrag in Euro", "euro");

        addCalculateButton();

        setVisible(true);
    }

    public static void main ( String[] args ) {
        new Waehrungsrechner();
    }

    private void setDefaults () {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
    }

    private void addNumberInput ( String title, String name ) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel(title);
        label.setLayout(new BorderLayout());
        JTextField textField = new JTextField(10);
        textField.addKeyListener(new KeyListenerNumberInput());
        textField.setName(name);
        textFields.add(textField);
        panel.add(label);
        panel.add(textField);
        panel.setAlignmentY(Component.TOP_ALIGNMENT);
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);
    }

    private void addCalculateButton () {
        JButton button = new JButton("Berechnen");
        button.addActionListener(this);
        button.setActionCommand("calculate");
        add(button);
    }

    @Override
    public void actionPerformed ( ActionEvent e ) {

        if ( e.getActionCommand().equals("calculate") ) {

            JTextField singapurdollar = null;
            JTextField euro = null;

            for ( JTextField textField : textFields ) {
                if ( textField.getName().equals("singapurdollar") ) {
                    singapurdollar = textField;
                } else if ( textField.getName().equals("euro") ) {
                    euro = textField;
                }
            }

            if ( singapurdollar == null || euro == null ) {
                System.out.println("Fehler: Felder nicht gefunden.");
                return;
            }

            try {
                if ( singapurdollar.getText() == null && euro.getText() == null ) {
                    System.out.println("Fehler: Keine Werte gegeben.");
                    return;
                }

                if ( singapurdollar.getText().length() == 0 && euro.getText().length() > 0 ) {
                    singapurdollar.setText(df.format(getBetragInSingapurdollar(Double.parseDouble(euro.getText().replaceAll(",", ".")))));
                    euro.setText("");
                } else if ( singapurdollar.getText().length() > 0 && euro.getText().length() == 0 ) {
                    euro.setText(df.format(getBetragInEuro(Double.parseDouble(singapurdollar.getText().replaceAll(",", ".")))));
                    singapurdollar.setText("");
                } else {
                    System.out.println("Fehler: Beide Werte gegeben.");
                }
            } catch ( NumberFormatException ex ) {
                System.out.println("Fehler: Keine Zahl eingegeben.");
            } catch ( Exception ex ) {
                System.out.println("Fehler: Unbekannter Fehler.");
            }

        }

    }

    private double getBetragInSingapurdollar ( double betragInEuro ) {
        return betragInEuro / 0.65;
    }

    private double getBetragInEuro ( double betragInSingapurdollar ) {
        return betragInSingapurdollar * 0.65;
    }

}

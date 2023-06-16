package net.bdweb.gds2.klausur_06.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {

    public MyButton ( String text ) {
        super(text);
        this.addActionListener(this);
        this.setActionCommand(text);
    }

    @Override
    public void actionPerformed ( ActionEvent e ) {
        System.out.println(e.getActionCommand());
    }

}

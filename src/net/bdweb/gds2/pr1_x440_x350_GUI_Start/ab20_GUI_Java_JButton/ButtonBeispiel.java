package net.bdweb.gds2.pr1_x440_x350_GUI_Start.ab20_GUI_Java_JButton;

import javax.swing.*;
import java.awt.*;

public class ButtonBeispiel extends JFrame {

    JButton bSchliessen;

    public ButtonBeispiel ( String text ) throws HeadlessException {
        
        super(text);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bSchliessen = new JButton("Schliessen");
        this.add(bSchliessen);

    }

}

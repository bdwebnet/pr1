package net.bdweb.gds2.pr1_x440_x350_GUI_Start.ab20_GUI_Java_JButton;

import javax.swing.*;
import java.awt.*;

public class ButtonBeispiel extends JFrame {

    JButton bSchliessen;

    public ButtonBeispiel ( String text ) throws HeadlessException {

        super(text);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("src/net/bdweb/gds2/pr1_x440_x350_GUI_Start/ab20_GUI_Java_JButton/exit.png", "Schliessen");

        bSchliessen = new JButton("Schliessen", new ImageIcon(image.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        bSchliessen.addActionListener(e -> System.exit(0));
        this.add(bSchliessen);

    }

}

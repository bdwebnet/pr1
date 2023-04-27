package net.bdweb.gds2.pr1_x440_x350_GUI_Start.ab30_GUI_Java_Uhr_Applikation;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame ( String title ) throws HeadlessException {
        super(title);

        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // basic layout
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
    }

}

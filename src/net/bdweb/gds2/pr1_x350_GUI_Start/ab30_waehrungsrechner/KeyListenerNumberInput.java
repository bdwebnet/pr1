package net.bdweb.gds2.pr1_x350_GUI_Start.ab30_waehrungsrechner;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerNumberInput implements KeyListener {

    private void listenerAction ( KeyEvent e ) {
        char c = e.getKeyChar();
        if ( !( Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_PERIOD || c == KeyEvent.VK_COMMA ) ) {
            e.consume();
        }
    }

    @Override
    public void keyTyped ( KeyEvent e ) {
        listenerAction(e);
    }

    @Override
    public void keyPressed ( KeyEvent e ) {
        listenerAction(e);
    }

    @Override
    public void keyReleased ( KeyEvent e ) {
        listenerAction(e);
    }

}

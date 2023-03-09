package net.bdweb.gds2.pr1_x280_x290_Vererbung.interfaces.a01;

public class DasFuenfte implements NachrichtenQuelle {

    private String nachricht;
    private NachrichtenEmpfaenger empfaenger;

    @Override
    public void anmelden ( NachrichtenEmpfaenger empf ) {
        empfaenger = empf;
    }

    @Override
    public void abmelden ( NachrichtenEmpfaenger empf ) {
        empfaenger = null;
    }

    @Override
    public void sendeNachricht ( String nachricht ) {
        empfaenger.empfangeNachricht(nachricht);
    }

    public String getNachricht () {
        return nachricht;
    }

    public void setNachricht ( String nachricht ) {
        this.nachricht = nachricht;
    }

}

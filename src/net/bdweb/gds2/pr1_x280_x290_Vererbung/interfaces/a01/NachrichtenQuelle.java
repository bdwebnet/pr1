package net.bdweb.gds2.pr1_x280_x290_Vererbung.interfaces.a01;

public interface NachrichtenQuelle {

    // Interessierte können sich bei der Quelle anmelden
// (falls sie noch nicht angemeldet sind)
    void anmelden ( NachrichtenEmpfaenger empf );

    // Angemeldete können sich bei der Quelle wieder abmelden
// (falls sie angemeldet sind)
    void abmelden ( NachrichtenEmpfaenger empf );

    // neue Nachricht wird an alle angemeldeten
// Empfaenger uebergeben
// (Aufruf deren Methode empfangeNachricht)
    void sendeNachricht ( String nachricht );

}

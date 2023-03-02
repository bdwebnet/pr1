package net.bdweb.gds2.pr1_x280_x290_Vererbung.ab_uebungen_vererbung.aufgabe04;

public class Ticketkontrolle {

    public static void main ( String[] args ) {
        String[] namen = { "Hans", "Peter", "Hans", "Peter", "Hans", "Peter", "Hans", "Peter", "Hans", "Peter", "Peter" };
        Ticket[] tickets = {
                new EinzelTicket(100, "20230302", 1),
                new Mehrfahrtenkarte(100, 10, 1),
                new EinzelTicket(100, "20230302", 1),
                new Mehrfahrtenkarte(100, 5, 4),
                new EinzelTicket(100, "20230302", 1),
                new Mehrfahrtenkarte(100, 0, 1),
                new EinzelTicket(100, "20230302", 1),
                new Mehrfahrtenkarte(100, 1, 5),
                new EinzelTicket(100, "20230302", 1),
                new Mehrfahrtenkarte(100, 10, 1),
                new Generalabo(100, "Peter", "20230301")
        };

        Ticketkontrolle kontrolle = new Ticketkontrolle();
        int schwarzFahrer = kontrolle.kontrolliere(namen, tickets, 1, "20230302");
        System.out.println("Schwarzfahrer: " + schwarzFahrer);
    }

    public int kontrolliere ( String[] namen, Ticket[] tickets, int zone, String datum ) {
        int schwarzFahrer = 0;

        if ( namen.length != tickets.length ) {
            System.out.println("ERROR: Arraylänge - Namen und Tickets unterschiedlich.");
        }

        for ( int i = 0; i < tickets.length; i++ ) {
            if ( tickets[i] instanceof EinzelTicket ticket ) {
                if ( !ticket.gueltigInZone(zone) || !ticket.gueltigAm(datum) ) {
                    schwarzFahrer++;
                }
            } else if ( tickets[i] instanceof Mehrfahrtenkarte ticket ) {
                if ( !ticket.gueltigInZone(zone) || ticket.istEntwertet() ) {
                    schwarzFahrer++;
                }
            } else if ( tickets[i] instanceof Generalabo ticket ) {
                if ( !ticket.gueltigInZone(zone) || !ticket.gueltFuerPerson(namen[i]) || !ticket.gueltigAm(datum) ) {
                    schwarzFahrer++;
                }
            }
        }

        return schwarzFahrer;
    }

}

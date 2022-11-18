package net.bdweb.gds2.pr1_x130_oo_grundlagen_klassen.ab_20_adv_gmbh;

public class Starter {

    public static void main(String[] args) {

        Artikel bowl = new Artikel();

        bowl.setBezeichnung("Julius Caesar Bowl");
        bowl.setPreis(10.95);

        System.out.println("Sie haben Folgendes bestellt: " + bowl.getBezeichnung());
        System.out.println("Kosten: " + bowl.getPreis() + " €");

    }

}

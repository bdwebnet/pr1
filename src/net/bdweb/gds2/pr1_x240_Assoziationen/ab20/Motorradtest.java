package net.bdweb.gds2.pr1_x240_Assoziationen.ab20;

public class Motorradtest {

    public static void main ( String[] args ) {
        Motor myMotor = new Motor(37, 1337);
        Reifen myVorderreifen = new Reifen(16, 3, "Sommer");
        Reifen myHinterreifen = new Reifen(16, 3, "Sommer");

        Motorrad harley = new Motorrad(myMotor, myVorderreifen, myHinterreifen);
        harley.gibInfo();

        Motorrad fatboy = new Motorrad(new Motor(37, 1337), new Reifen(16, 3, "Sommer"), new Reifen(16, 3, "Sommer"));
        System.out.println(fatboy.getHinterreifen().getDurchmesser());
    }

}

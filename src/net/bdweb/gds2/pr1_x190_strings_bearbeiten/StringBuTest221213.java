package net.bdweb.gds2.pr1_x190_strings_bearbeiten;

public class StringBuTest221213 {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 10000000; i++) {
            str.append(i);
        }

        long endTime = System.nanoTime();

        System.out.println("fertig");
        System.out.println(startTime-endTime);

        String str2 = "";

        startTime = System.nanoTime();

        for (int i = 0; i < 10000000; i++) {
            str2 += i;
        }

        endTime = System.nanoTime();

        System.out.println("fertig");
        System.out.println(startTime-endTime);


    }

}

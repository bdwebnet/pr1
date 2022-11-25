package net.bdweb.gds2.pr1_x170_statische_methoden.sonstiges;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test_1 {

    int [] yourInteger;

    static void change (int [] test) {
        for (int i = 0; i < test.length; i++) {
            test[i] += 100;
        }
    }

    public static void main(String[] args) {

        int[] example = {2, 4, 6};

        Test_1 tester = new Test_1();
        tester.yourInteger = example;

        System.out.println("YourInteger before the Change was: " + Arrays.toString(tester.yourInteger));

        change(tester.yourInteger);

        System.out.println("YourInteger after the Change was: " + Arrays.toString(tester.yourInteger));

    }

}

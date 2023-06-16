package net.bdweb.gds2.pr1_x440_x420_Lambda_Ausdruecke.ab10_einfuehrung;

import java.time.LocalDate;
import java.util.List;

public class Tester {

    public static void main ( String[] args ) {

        int vergleichsAlter = 18;

        Person test = new Person("Test", Person.Sex.MALE);
        test.setBirthday(LocalDate.of(2000, 6, 17));
        System.out.println(test.getAge());

        Person per1 = new Person("Tick", Person.Sex.MALE);
        Person per2 = new Person("Trick", Person.Sex.MALE);
        Person per3 = new Person("Track", Person.Sex.MALE);

        Person per4 = new Person("Daisy", Person.Sex.FEMALE);
        Person per5 = new Person("Donald", Person.Sex.MALE);

        per1.setBirthday(LocalDate.of(2002, 1, 1));
        per2.setBirthday(LocalDate.of(2009, 5, 1));
        per3.setBirthday(LocalDate.of(20011, 5, 1));

        per4.setBirthday(LocalDate.of(1980, 1, 1));
        per5.setBirthday(LocalDate.of(1970, 1, 1));

        List<Person> persons = List.of(per1, per2, per3, per4, per5);

        Person.printPersonsOlderThan(persons, vergleichsAlter);

        Person.printPersons(persons, new CheckPersonEligibleForSelectiveService());

    }

}

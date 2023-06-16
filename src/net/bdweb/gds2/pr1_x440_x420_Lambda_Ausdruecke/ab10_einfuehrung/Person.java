package net.bdweb.gds2.pr1_x440_x420_Lambda_Ausdruecke.ab10_einfuehrung;

import java.time.LocalDate;
import java.util.List;

public class Person {

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;
    //private int age;

    public Person ( String name, Sex gender ) {
        this.name = name;
        this.gender = gender;
    }

    public static void printPersonsOlderThan ( List<Person> roster, int age ) {
        for ( Person p : roster ) {
            if ( p.getAge() >= age ) {
                p.printPerson();
            }
        }
    }

    public static void printPersons ( List<Person> roster, CheckPerson tester ) {
        for ( Person p : roster ) {
            if ( tester.test(p) ) {
                p.printPerson();
            }
        }
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public LocalDate getBirthday () {
        return birthday;
    }

    public void setBirthday ( LocalDate birthday ) {
        this.birthday = birthday;
    }

    public Sex getGender () {
        return gender;
    }

    public void setGender ( Sex gender ) {
        this.gender = gender;
    }

    public String getEmailAddress () {
        return emailAddress;
    }

    public void setEmailAddress ( String emailAddress ) {
        this.emailAddress = emailAddress;
    }

    public int getAge () {
        LocalDate today = LocalDate.now();

        int days = today.getDayOfMonth() - this.getBirthday().getDayOfMonth();
        int months = today.getMonthValue() - this.getBirthday().getMonthValue();

        int years = today.getYear() - this.getBirthday().getYear();

        if ( months > 0 ) {
            years--;
        } else if ( months == 0 && days > 0 ) {
            years--;
        }

        return years;
    }

    private void printPerson () {
        System.out.println("Name: " + this.getName() + "; Geschlecht: " + this.getGender() + "; Alter: " + this.getAge());
    }

    public enum Sex {MALE, FEMALE, DIVERS}

}

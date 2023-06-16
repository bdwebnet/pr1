package net.bdweb.gds2.pr1_x440_x420_Lambda_Ausdruecke.ab10_einfuehrung;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {

    @Override
    public boolean test ( Person p ) {
        return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
    }

}

package net.bdweb.gds2.klausur_05.x320_Interfaces;

public class MyClass implements InterfaceOne, InterfaceTwo {

    public static void main ( String[] args ) {
        MyClass myClass = new MyClass();
        myClass.functionTwo();
    }

    @Override
    public void functionOne () throws Exception {
        throw new Exception("Not implemented");
    }

    @Override
    public void functionTwo () {
        try {
            functionOne();
        } catch ( Exception e ) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        System.out.println("test");
    }

}

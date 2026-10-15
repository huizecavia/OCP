package Seven;



abstract interface If1 {}     // implicitly public and abstract

interface If2 {
    void method1();  // impliciet public and abstract
    // void method2() {}     // dit mag niet want verplicht abstract
    default void method2() {
        System.out.println("Interface.method2 super");  // mag wel want default
    }  // mag wel want default

    static int a = 5;
    int b = 6;
}


public class Interface implements If2 {

    public void method2() {
        System.out.println("Interface.method2`");
    }   // public vereist want interface method is public

    public void method1() {
        System.out.println("Interface.method1");
    }


    void superr() {
        If2.super.method2();   // mag hier want non-static    // methode mag niet super heten
    }

    static void Static() {
        System.out.println(a);
        System.out.println(b);
        // b = 9;  // mag niet want b is final


    }

    public static void main(String... args) {
        Interface i = new Interface();
        i.method1();
        i.method2();
        // If2.super.method2();   // mag hier niet  want static
        
    }

}


// static class
// inner class

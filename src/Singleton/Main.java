package Singleton;

public class Main {
    public static void main(String... args) {

        System.out.println("Testing Singleton");
        System.out.println("-----------------");

        // Testing first singleton, should work
        Singleton singleton = Singleton.getInstance();
        System.out.println("-----------------");

        // Testing second singleton, a new singleton should not be instantiated
        Singleton singletonTwo = Singleton.getInstance();
        System.out.println("-----------------");

        // Testing that getInstance() returns the same object
        if (singleton == singletonTwo) {
            StringBuilder sb = new StringBuilder(singleton.toString());
            sb.append(" and ");
            sb.append(singletonTwo.toString());
            sb.append(" are the same object.");
            System.out.println(sb.toString());
        }
    }
}

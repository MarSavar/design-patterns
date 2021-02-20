package Singleton;

public class Singleton {

    private static Singleton instance;

    private  Singleton() { }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("A singleton has been created.");
        }
        else {
            System.out.println("Cannot instantiate any more singletons.");
        }
        return instance;
    }


}

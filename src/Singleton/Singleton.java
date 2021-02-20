package Singleton;

public class Singleton {

    private static Singleton instance;

    private  Singleton() { }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        if (instance == null) {
            return "No instance of the singleton has been initialised.";
        }
        return "Singleton instance";
    }

}

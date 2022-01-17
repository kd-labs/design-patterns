package designpatterns.creational.singleton;

class Singleton {

    private static volatile Singleton instance;

    private String value;

    private Singleton(String value) {
        if(instance != null) {
            throw new UnsupportedOperationException("Not allowed to directly call the constructor using Reflection API");
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton(value);
            }
        }

        return instance;
    }

    public String getValue() {
        return value;
    }
}

package designPattern.creational.singleton.eager.threadSafe;

public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonThreadSafe;

    //constructor.
    private SingletonThreadSafe(){}

    public static SingletonThreadSafe getSingletonThreadSafeInstance() {
        synchronized (SingletonThreadSafe.class) {
            if (singletonThreadSafe == null) {
                singletonThreadSafe = new SingletonThreadSafe();
            }
        }
        return singletonThreadSafe;
    }
}

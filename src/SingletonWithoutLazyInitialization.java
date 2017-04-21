/**
 * Created by java_dev on 21.04.17.
 */
public class SingletonWithoutLazyInitialization {
    private static SingletonWithoutLazyInitialization instance = new SingletonWithoutLazyInitialization();
    private SingletonWithoutLazyInitialization()    {
        //Description of the object initialization process.
        // - It is not possible to handle exceptions in the constructor.
        // - WithoutLazyInitialization.
    }
    public static SingletonWithoutLazyInitialization getInstance()  {
        return instance;
    }
}

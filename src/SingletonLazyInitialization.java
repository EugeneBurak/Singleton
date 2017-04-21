/**
 * Created by java_dev on 21.04.17.
 */
public class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance = null;
    private SingletonLazyInitialization()   {
        //Description of the object initialization process.
        // - Synchronization works every time you access the method getInstance().
    }
    public static synchronized SingletonLazyInitialization getInstance()    {
        if (instance == null)   {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }
}

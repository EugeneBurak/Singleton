/**
 * Created by java_dev on 21.04.17.
 */
public class SingletonWithDoubleLocking {
    private static volatile SingletonWithDoubleLocking instance = null;
    private SingletonWithDoubleLocking()    {
        //Description of the object initialization process.
        // - Modifier volatile can lead to performance problems.
    }
    public static SingletonWithDoubleLocking getInstance()  {
        if (instance == null)   {
            synchronized (SingletonWithDoubleLocking.class) {
                if (instance == null)   {
                    instance = new SingletonWithDoubleLocking();
                }
            }
        }
        return instance;
    }
}

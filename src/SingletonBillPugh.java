/**
 * Created by java_dev on 21.04.17.
 */
public class SingletonBillPugh {
    private SingletonBillPugh() {
        //Description of the object initialization process.
        // - It is not possible to handle exceptions in the constructor.
    }
    private static class SingletonHelper    {
        private static final SingletonBillPugh instance = new SingletonBillPugh();
    }
    public static SingletonBillPugh getInstance()   {
        return SingletonHelper.instance;
    }
}

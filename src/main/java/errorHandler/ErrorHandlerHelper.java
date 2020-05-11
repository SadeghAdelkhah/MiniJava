package errorHandler;

/**
 * Created by Alireza on 6/28/2015.
 */
public final class ErrorHandlerHelper {
    public static boolean hasError = false;
    private ErrorHandlerHelper() {
        //TODO
    }
    public static void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
}

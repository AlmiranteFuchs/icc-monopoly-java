package model.utils;

public class WaitHelper {
    private WaitHelper() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    public static void Wait(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

import java.lang.Runnable;
import java.lang.Thread;

public class RunnableDemo {
    
    public static void main(String[] args) {
        // Here, we can declare a little bundle of code
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Hello, world!");
            }
        };

        // It won't do anything though until we tell it
        r.run();

        // Even cooler, we can pass runnables into other functions.
        // It basically lets us bundle in a bunch of actions!
        Runnable sayDone = new Runnable() {
            public void run() {
                System.out.println("Done!");
            }
        };
        doComplexThing(sayDone);
    }

    private static void doComplexThing(Runnable r) {
        int sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum += i;
        }
        r.run();
    }
}
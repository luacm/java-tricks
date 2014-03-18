import java.lang.Runnable;
import java.lang.Thread;

/**
 * Normally, you can't pass a method as a parameter to another method.
 * However, you can do this in other languages (like Javascript and Lisp).
 * Runnables are pretty much Java's solution to that. Runnable is an 
 * interface that you can implement that simply has one method: run().
 * By passing this object around, you can call the run() method at any time,
 * making the Runnable a little action bundle.
 *
 * You might find it odd how the Runnable is declared. Sure, you can make 
 * a separate file and inherit the interface and make it is own class. 
 * However, Runnables are usually only used once. Making a separate file
 * and class is overkill. Instead, we can declare a class 'anonymously'. 
 * By anonymous, we mean it doesn't have a name, so it would be impossible
 * for us to create another instance of it. The syntax is pretty straightforward
 * and can be seen below. You really just write out the class inline with the
 * rest of your code. It looks weird at first, but you'll get used to it,
 * and it's very powerful.
 */
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

/**
 * Class created to instantiating threads and put it in concurrency mode.
 * @author Marcelo Fortuna
 * @since 07/12/2023
 */
public class Process {

    public static void main(String[] args) {
        ExecutionLine t1, t2, t3, t4;

        while(true) {
            // Creating new threads.
            t1 = new ExecutionLine("Marcelo Fortuna");
            t2 = new ExecutionLine("FATEC SPB precisa de ar-condicionado.");
            t3 = new ExecutionLine("SANTOS NA SÉRIE B KKKKKKKKKKKKKK");
            t4 = new ExecutionLine("Palmeiras campeão????");

            // Put the threads in "Done" state.
            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
    }
}

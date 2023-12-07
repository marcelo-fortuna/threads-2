
/**
 * Class created to demonstrate the use of threads in programs that require concurrency and parallelism between processes.
 *
 * @author Marcelo Fortuna
 * @since 07/12/2023
 */
public class ExecutionLine extends Thread {
    int sleepTime;

    public ExecutionLine(String name) {
        super(name);
        sleepTime = (int) (Math.random() * 500000);

        System.out.println("A thread " + super.getName() + " vai dormir por " + sleepTime + "ms");
    }

    /**
     * Method that executes thread.
     */
    public void run() {
        try {
            System.out.println("A thread " + super.getName() + " foi dormir.");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("A thread foi interrompida!");
        }
        System.out.println("A thread " + super.getName() + " acordou do seu excelentíssimo sono.");
    }
}

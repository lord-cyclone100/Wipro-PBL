class PriorityTask implements Runnable {
    private final String taskName;

    public PriorityTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
        }
        System.out.println(taskName + " completed.");
    }
}

public class Test {
    public static void main(String[] args) {
        Thread maxPriorityThread = new Thread(new PriorityTask("Max Priority Thread"));
        Thread minPriorityThread = new Thread(new PriorityTask("Min Priority Thread"));
        Thread normPriorityThread = new Thread(new PriorityTask("Norm Priority Thread"));

        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);   // typically 10
        minPriorityThread.setPriority(Thread.MIN_PRIORITY);   // typically 1
        normPriorityThread.setPriority(Thread.NORM_PRIORITY); // typically 5

        // Start all threads simultaneously
        maxPriorityThread.start();
        minPriorityThread.start();
        normPriorityThread.start();

        // Wait for all threads to complete
        try {
            maxPriorityThread.join();
            minPriorityThread.join();
            normPriorityThread.join();
        } catch (InterruptedException e) {
            System.err.println("Interrupted: " + e.getMessage());
        }

        System.out.println("All threads completed.");
    }
}


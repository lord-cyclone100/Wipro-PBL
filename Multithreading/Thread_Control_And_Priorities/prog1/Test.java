class DelayedPrinterTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            if (i == 5) {
                try {
                    Thread.sleep(5000); // Pause for 5000 milliseconds after printing 5
                } catch (InterruptedException e) {
                    System.err.println("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }
}

public class Test {

    public static void main(String[] args) {
        DelayedPrinterTask task = new DelayedPrinterTask();
        Thread thread = new Thread(task);
        thread.start();
    }
}

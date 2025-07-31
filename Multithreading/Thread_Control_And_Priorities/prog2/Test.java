class EvenNumberTask implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddNumberTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumberTask());
        Thread oddThread = new Thread(new OddNumberTask());

        evenThread.start();

        try {
            evenThread.join(); // Wait for even numbers to finish before starting odd numbers
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }

        oddThread.start();
    }
}

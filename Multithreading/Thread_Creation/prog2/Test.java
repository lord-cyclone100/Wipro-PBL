import java.util.Random;

class ColourDisplayTask implements Runnable {

    private String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    private Random random = new Random();

    @Override
    public void run() {
        while (true) {
            int index = random.nextInt(colours.length);
            String selectedColour = colours[index];
            System.out.println("Selected Colour: " + selectedColour);

            if ("red".equalsIgnoreCase(selectedColour)) {
                System.out.println("Red matched! Stopping display...");
                break;
            }

            try {
                Thread.sleep(500); // To slow down output for readability
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted.");
                break;
            }
        }
    }
}

public class Test {

    public static void main(String[] args) {
        ColourDisplayTask task = new ColourDisplayTask();
        Thread displayThread = new Thread(task);
        displayThread.start();
    }
}
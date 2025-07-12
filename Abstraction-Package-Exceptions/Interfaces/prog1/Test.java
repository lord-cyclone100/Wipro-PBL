package live;

import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;

public class Test {
    public static void main(String[] args) {
        // a. Direct instances
        Veena veena = new Veena();
        veena.play();

        Saxophone sax = new Saxophone();
        sax.play();

        // b. Using Playable reference
        Playable instrument1 = veena;
        Playable instrument2 = sax;

        instrument1.play();  // Polymorphic behavior
        instrument2.play();
    }
}

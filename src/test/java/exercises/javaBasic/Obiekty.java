package exercises.javaBasic;

import org.junit.Test;

public class Obiekty {
    @Test
    public void przykladObiektu() {
        Klasa nowyObiekt = new Klasa();

        Klasa nowy = new Klasa("sun", "big", 8);
        nowy.printStarName();
        nowy.printStarType();
        nowy.printStarNumber();

        Klasa nowszy = new Klasa("sunny", "small", 109);
        nowszy.printStarName();
        nowszy.printStarType();
        nowszy.printStarNumber();
    }
}
package VierGewinnt;


import org.junit.Test;

public class SpielFeldTest {

    @Test
    public void normalFeld() {
        ISpielSteuerung spielfeld = new VierGewinntSpiel();
        spielfeld.erstelleSpielfeld(10, 10);
    }

    @Test
    public void normalFeld2() {
        ISpielSteuerung spielfeld = new VierGewinntSpiel();
        spielfeld.erstelleSpielfeld(10, 10);
    }
}
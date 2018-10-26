package VierGewinnt;

import org.junit.Before;
import org.junit.Test;

public class SpielTest {

    ISpielSteuerung spiel;

    @Before
    public void init() {
        spiel = new VierGewinntSpiel();
        spiel.erstelleSpielfeld(5, 5);
    }

    @Test
    public void SpieleAbwechselnd() {
        Zug zug = new Zug(Spieler.ROT, 0, 0);
        spiel.fuehreZugAus(zug);

        zug = new Zug(Spieler.SCHWARZ, 0, 0);
        spiel.fuehreZugAus(zug);
    }

    @Test(expected = SpielException.class)
    public void feldExistiertNicht() {
        Zug zug = new Zug(Spieler.ROT, 6, 6);
        spiel.fuehreZugAus(zug);

        zug = new Zug(Spieler.SCHWARZ, 6, 6);
        spiel.fuehreZugAus(zug);
    }
}
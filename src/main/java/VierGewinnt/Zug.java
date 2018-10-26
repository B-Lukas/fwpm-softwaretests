package VierGewinnt;

import lombok.Getter;
import lombok.Setter;

public class Zug {

    @Getter
    @Setter
    private int x;
    @Getter
    @Setter
    private int y;
    @Getter
    @Setter
    private Spieler spieler;

    public Zug(Spieler spieler, int x, int y) {
        this.spieler = spieler;
        this.x = x;
        this.y = y;
    }
}

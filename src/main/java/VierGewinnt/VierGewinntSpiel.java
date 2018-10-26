package VierGewinnt;

public class VierGewinntSpiel implements ISpielSteuerung{

    Spieler [][] spielFeld = null;

    public void fuehreZugAus(Zug zug) {

    }

    public void erstelleSpielfeld(int x, int y) {
        if(x < 5|| y < 5){
            throw new SpielException("Spielfeld ist zu klein");
        }

        spielFeld = new Spieler[x][y];
    }
    public Spieler isGewonnen() {
        return null;
    }
}

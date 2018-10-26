package VierGewinnt;

public interface ISpielSteuerung {

    public void fuehreZugAus(Zug zug);

    public void erstelleSpielfeld(int x, int y);

    public Spieler isGewonnen();
}

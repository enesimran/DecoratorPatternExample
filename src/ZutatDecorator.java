public abstract class ZutatDecorator extends Getraenk {
    protected Getraenk getraenk; // Geschütztes Attribut, das das zu dekorierende Getraenk hält

    public ZutatDecorator(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    public abstract String getBeschreibung(); // Stelle sicher, dass alle Decorators ihre eigene Beschreibung implementieren
}

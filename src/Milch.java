public class Milch extends ZutatDecorator{

    Getraenk getraenk;

    public Milch(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    public String getBeschreibung() {
        return String.format("%s, Milch", this.getraenk.getBeschreibung());
    }

    public double preis() {
        return this.getraenk.preis() + 0.50;
    }

}

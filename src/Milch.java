public class Milch extends ZutatDecorator{

    public Milch(Getraenk getraenk) {
        super(getraenk);
    }

    public String getBeschreibung() {
        return String.format("%s, Milch", this.getraenk.getBeschreibung());
    }

    public double preis() {
        return this.getraenk.preis() + 0.50;
    }

}

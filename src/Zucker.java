public class Zucker extends ZutatDecorator{

    public Zucker(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Zucker";
    }

    public double preis() {
        return getraenk.preis() + 0.25;
    }
}

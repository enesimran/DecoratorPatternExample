public abstract class Getraenk {

    String beschreibung = "Unbekanntes Getränk";

    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double preis();

}

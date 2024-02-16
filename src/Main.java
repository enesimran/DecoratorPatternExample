public class Main {
    public static void main(String[] args) {
        System.out.println("--- meinKaffee ---");
        Getraenk meinKaffee = new Kaffee();
        meinKaffee = new Milch(meinKaffee);
        meinKaffee = new Zucker(meinKaffee);
        System.out.println("             Preis: " + meinKaffee.preis());
        System.out.println("      Beschreibung: " + meinKaffee.getBeschreibung());
        System.out.println("Klasse des Objekts: " + meinKaffee.getClass());
        System.out.println("------------------");
        System.out.println();
        System.out.println("-- meinKaffee 2 --");
        Getraenk meinKaffee2 = new Kaffee();
        meinKaffee2 = new Zucker(meinKaffee2);
        meinKaffee2 = new Zucker(meinKaffee2);
        meinKaffee2 = new Zucker(meinKaffee2);
        meinKaffee2 = new Zucker(meinKaffee2);
        meinKaffee2 = new Milch(meinKaffee2);
        System.out.println("             Preis: " + meinKaffee2.preis());
        System.out.println("      Beschreibung: " + meinKaffee2.getBeschreibung());
        System.out.println("Klasse des Objekts: " + meinKaffee2.getClass());
        System.out.println("------------------");

    }
}
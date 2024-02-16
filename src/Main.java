public class Main {
    public static void main(String[] args) {
        Getraenk meinKaffee = new Kaffee();
        meinKaffee = new Milch(meinKaffee);
        meinKaffee = new Milch(meinKaffee);
        System.out.println(meinKaffee.preis());
        System.out.println(meinKaffee.getBeschreibung());

    }
}
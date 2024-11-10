public class main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");

        Kucing kucing = new Kucing("Nabil", 10, "Kucing Komplek");
        System.out.println("Kucing Garong Saingan Booby Kartanegara ini Bernama " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("Wishkas Mahal");
        System.out.println();

        Burung burung = new Burung("Angga", 1, "Putih");
        System.out.println("Burung Bangau ini Bernama Si " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("Ikan");
        System.out.println();

        kucing.infoHewan();
        burung.infoHewan();
    }
}

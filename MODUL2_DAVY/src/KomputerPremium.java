class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahkomputer,String namaWarnet,float hargaPerJam,boolean ruangPrivat ) {
        super(jumlahkomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat=ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void informasi () {
        super.informasi();
        if (ruangPrivat) {
            System.out.println("Status : Komputer Premium");
            System.out.println("Harga : 10000.0");
            System.out.println("|Fasilitas Ruangan Premium|");
            System.out.println("Ruangan ber-AC Pribadi");
            System.out.println("Free Es Teh Manis");
            System.out.println("Dapet Stiker Kalcer Keren Sabandungeun");
            System.out.println("Internetnya Cepet banget 100mbps");
            System.out.println("Ada beberapa komputer merk Apple");
        } else {
            System.out.println("|Fasilitas Ruangan Standar|");
            System.out.println("Ruangan panas pisaannnn");
            System.out.println("Banyak kucing garong");
            System.out.println("Komputer B aja");
            System.out.println("Ruangan biasa aja, minus banyak asap rokok");
            System.out.println("Duduk di kursi plastik kaya wdp");
        }
   
    }
 
    public void Pesan( int nomorKomputer) {
        System.out.println("Anda Memesan Komputer Nomor : "+ nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan( String Makanan) {
        System.out.println("Anda Memesan Makanan : "+ Makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan

}

class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahkomputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahkomputer,String namaWarnet,float hargaPerJam) {
        this.jumlahkomputer =jumlahkomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
public void informasi () {
    System.out.println("Jumlah Komputer : " + jumlahkomputer);
    System.out.println("Nama Warnett : ");
    System.out.println("Harga Per Jam : ");
}
}
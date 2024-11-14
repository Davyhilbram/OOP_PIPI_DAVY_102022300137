class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahkomputer,String namaWarnet,float hargaPerJam,boolean vipCard ) {
        super(jumlahkomputer, namaWarnet, hargaPerJam);
        this.vipCard=vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void informasi () {
        super.informasi();
        System.out.println("Harga per Jam : Rp.7000 ");
        System.out.println("Status : Member VIP ");
    }
    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

}
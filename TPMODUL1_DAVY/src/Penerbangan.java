class Penerbangan {
    String nomorPenerbangan;
    String asal;
    String tujuan;
    String waktuBerangkat;
    String waktuTiba;
    int hargaTiket;

    Penerbangan(String nomorPenerbangan, String asal, String tujuan, 
               String waktuBerangkat, String waktuTiba, int hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.asal = asal;
        this.tujuan = tujuan;
        this.waktuBerangkat = waktuBerangkat;
        this.waktuTiba = waktuTiba;
        this.hargaTiket = hargaTiket;
    }

    void tampilInfo(int index) {
        System.out.println(index + ". " + nomorPenerbangan + " | " + asal + " -> " + tujuan + 
                           " | " + waktuBerangkat + " - " + waktuTiba + " | Rp." + hargaTiket);
}
}
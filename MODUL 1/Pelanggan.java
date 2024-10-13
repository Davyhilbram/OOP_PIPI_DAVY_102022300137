public class Pelanggan {
    private String nik;
    private String namaDepan;
    private String namaBelakang;
    private Penerbangan penerbangan;

    public Pelanggan(String nik, String namaDepan, String namaBelakang) {
        this.nik = nik;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void setPenerbangan(Penerbangan penerbangan) {
        this.penerbangan = penerbangan;
    }

    public Penerbangan getPenerbangan() {
        return penerbangan;
    }

    public void tampilkanTiket() {
        System.out.println("======= Detail Tiket Penerbangan =======");
        System.out.println("Nomor Induk Kependudukan: " + nik);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
        System.out.println("Nomor Penerbangan: " + penerbangan.getNomorPenerbangan());
        System.out.println("Bandara Keberangkatan: " + penerbangan.getBandaraKeberangkatan() + " ---> Bandara Tujuan: " + penerbangan.getBandaraTujuan());
        System.out.println("Waktu Keberangkatan: " + penerbangan.getWaktuKeberangkatan() + " ---> Waktu Kedatangan: " + penerbangan.getWaktuKedatangan());
        System.out.println("Harga Tiket: Rp." + penerbangan.getHargaTiket());
    }
}

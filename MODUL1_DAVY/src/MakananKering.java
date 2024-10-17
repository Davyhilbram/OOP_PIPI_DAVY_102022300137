

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;
    

    // Todo : Create Constructor of MakananKering
    public MakananKering(String nama, int jumlah, double harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
        
    }

    // Todo : Create Getter and Setter
    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public String getBramd() {
        return brand;
    }
    // Todo : Create Method ShowData
    public void tampilkanData () {
        System.out.println("nama :"+ nama);
        System.out.println("jumlah :"+ jumlah);
        System.out.println("nama :"+ harga);
        System.out.println("Bramd :"+ brand);
    }

}

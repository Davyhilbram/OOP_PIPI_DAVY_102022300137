// Don't delete any comments below!!!

public class Makanan {
    private String nama;
    private int jumlah;
    private double harga;

    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    public Makanan(String nama, int jumlah, double harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    
    }
   

    // Todo : Create Constructor of Makanan
    public String getNama() {
        return nama;
    }

    public int  getjumlah() {
        return jumlah;
    }

    public double getJumlah () {
        return jumlah;
    }


    // Todo : Create Getter and Setter

    public void tampilkanData () {
        System.out.println("nama :"+ nama);
        System.out.println("jumlah :"+ jumlah);
        System.out.println("nama :"+ harga);

}

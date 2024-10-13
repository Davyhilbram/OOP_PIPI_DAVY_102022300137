import java.util.Scanner;

public class Main {
    static Penerbangan[] daftarPenerbangan = {
        new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000),
        new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000)
    };
    
    static Pelanggan pelanggan;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("====== EAD Ticket Booking System ======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilDaftarPenerbangan();
                    break;
                case 2:
                    beliTiket(input);
                    break;
                case 3:
                    tampilkanPesanan();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 4);
        
        input.close();
    }

    public static void tampilDaftarPenerbangan() {
        for (int i = 0; i < daftarPenerbangan.length; i++) {
            System.out.println((i + 1) + ". ");
            daftarPenerbangan[i].tampilDaftarPenerbangan();
        }
    }

    public static void beliTiket(Scanner input) {
        input.nextLine(); // Clear buffer
        System.out.println("Silakan isi data diri Anda terlebih dahulu");

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = input.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = input.nextLine();

        pelanggan = new Pelanggan(nik, namaDepan, namaBelakang);

        System.out.println("Terima kasih telah mengisi data pelanggan. Silakan pilih tiket penerbangan yang tersedia:");
        tampilDaftarPenerbangan();

        System.out.print("Pilih nomor penerbangan (ex: 1): ");
        int pilihan = input.nextInt();
        if (pilihan >= 1 && pilihan <= daftarPenerbangan.length) {
            pelanggan.setPenerbangan(daftarPenerbangan[pilihan - 1]);
            System.out.println("Pemesanan tiket berhasil dilakukan, cek pesanan tiket pada menu (3)");
        } else {
            System.out.println("Penerbangan tidak ditemukan.");
        }
    }

    public static void tampilkanPesanan() {
        if (pelanggan == null || pelanggan.getPenerbangan() == null) {
            System.out.println("Pembelian tiket tidak ada.");
        } else {
            pelanggan.tampilkanTiket();
        }
    }
}

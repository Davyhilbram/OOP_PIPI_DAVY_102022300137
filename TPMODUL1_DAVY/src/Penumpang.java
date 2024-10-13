class Penumpang { 
    String NIK;
    String namaDepan;
    String namaBelakang;

    Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    void tampilDetailPenumpang () {
        
        System.out.println(" Penumpang: " + namaDepan + " " + namaBelakang + " (NIK: " + NIK + ")")
        ;
    }}
    

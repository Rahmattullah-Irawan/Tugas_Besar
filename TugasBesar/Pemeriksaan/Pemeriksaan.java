public class Pemeriksaan {
    private String noPemeriksaan;
    private String namaPasien;
    private String namaDokter;
    private double biayaPemeriksaan;

    // Constructor
    public Pemeriksaan(String noPemeriksaan, String namaPasien, String namaDokter, double biayaPemeriksaan) {
        this.noPemeriksaan = noPemeriksaan;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
        this.biayaPemeriksaan = biayaPemeriksaan;
    }

    // Method non-void untuk hitung total
    public double hitungTotal() {
        return biayaPemeriksaan; // Bisa ditambah biaya admin/obat jika diperlukan
    }

    // Method tampilData
    public void tampilData() {
        System.out.println("No Pemeriksaan    : " + noPemeriksaan);
        System.out.println("Nama Pasien       : " + namaPasien);
        System.out.println("Nama Dokter       : " + namaDokter);
        System.out.println("Biaya Pemeriksaan : " + biayaPemeriksaan);
        System.out.println("Total Biaya       : " + hitungTotal());
        System.out.println("-----------------------------------");
    }
}
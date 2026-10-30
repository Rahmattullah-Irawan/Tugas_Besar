import java.util.ArrayList;

public class MainPemeriksaan {
    public static void main(String[] args) {
        // 1. Deklarasi ArrayList
        ArrayList<Pemeriksaan> listPemeriksaan = new ArrayList<>();

        // 2. Data Entry: Masukkan minimal 3 object pemeriksaan
        listPemeriksaan.add(new Pemeriksaan("P001", "Budi Santoso", "Dr. Siska, Sp.A", 150000));
        listPemeriksaan.add(new Pemeriksaan("P002", "Siti Aminah", "Dr. Haryanto, Sp.PD", 200000));
        listPemeriksaan.add(new Pemeriksaan("P003", "Ahmad Dani", "Dr. Rini, M.Biomed", 125000));

        // 3. Iterasi menggunakan For-Each loop
        System.out.println("=== DAFTAR PEMERIKSAAN KLINIK ===");
        for (Pemeriksaan p : listPemeriksaan) {
            p.tampilData();
        }
    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Tiket("T001", "Agak Laen", "Reguler", 40000, 2));
        daftarTiket.add(new Tiket("T002", "Jumbo", "VIP", 60000, 1));
        daftarTiket.add(new Tiket("T003", "Keluarga Cemara", "Reguler", 35000, 3));

        for (Tiket tiket : daftarTiket) {
            System.out.println("========================================");
            System.out.println("          DATA PEMESANAN TIKET          ");
            System.out.println("========================================");
            tiket.tampilData();
        }
        System.out.println("========================================");
    }
}
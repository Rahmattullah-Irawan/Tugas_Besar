public class MainMenu {
    public static void main(String[] args) {
        
        Menu menu1 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        
        int jumlahPesanan = 2; // Parameter input jumlah sesuai ekspektasi soal

        System.out.println("=== STRUK PESANAN KAFE ===");
        menu1.tampilMenu();
        System.out.println("Jumlah   : " + jumlahPesanan);
        System.out.println("Total    : " + menu1.hitungHarga(jumlahPesanan));
        System.out.println("-----------------------------------");
    }
}
public class MainBuku {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("B001", "Belajar Java Dasar", "Andi Prasetyo", 75000);
        Buku buku2 = new Buku("B002", "Pemrograman Berorientasi Objek", "Budi Raharjo", 120000);

        System.out.println("=== DATA INVENTARIS BUKU ===");
        buku1.tampilData();
        buku2.tampilData();
    }
}
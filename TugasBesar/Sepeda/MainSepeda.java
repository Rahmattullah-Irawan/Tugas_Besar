public class MainSepeda {
    public static void main(String[] args) {
        // Instansiasi minimal 2 object sepeda
        Sepeda sepeda1 = new Sepeda("S01", "Mountain Bike", 3, 15000);
        Sepeda sepeda2 = new Sepeda("S02", "Road Bike", 2, 25000);

        System.out.println("=== DATA RENTAL SEPEDA ===");
        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}
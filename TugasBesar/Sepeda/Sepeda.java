public class Sepeda {
    // Attribute private (Encapsulation)
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;

    // Constructor Sepeda
    public Sepeda(String kodeSepeda, String jenisSepeda, int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    // Method non-void untuk kalkulasi biaya
    public double hitungBiaya() {
        return lamaSewa * hargaPerJam;
    }

    // Method tampilData (void)
    public void tampilData() {
        System.out.println("Kode Sepeda   : " + kodeSepeda);
        System.out.println("Jenis Sepeda  : " + jenisSepeda);
        System.out.println("Lama Sewa     : " + lamaSewa + " Jam");
        System.out.println("Harga per Jam : " + hargaPerJam);
        System.out.println("Total Biaya   : " + hitungBiaya());
        System.out.println("-----------------------------------");
    }
}
public class Hotel {
    String nama;
    String kota;
    int harga;
    byte bintang;

    // Konstruktor untuk inisialisasi
    public Hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    // Metode untuk menampilkan informasi hotel
    void tampilInformasi() {
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Kota: " + kota);
        System.out.println("Harga: " + harga);
        System.out.println("Bintang: " + bintang);
        System.out.println("---------------------------------");
    }
}

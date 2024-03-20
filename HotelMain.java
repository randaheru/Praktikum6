
public class HotelMain {
    public static void main(String[] args) {
        // Membuat objek layanan hotel
        HotelService hotelService = new HotelService();

        // Menambahkan beberapa hotel
        hotelService.tambah(new Hotel("Hotel A", "Jakarta", 500000, (byte) 4));
        hotelService.tambah(new Hotel("Hotel B", "Bandung", 400000, (byte) 3));
        hotelService.tambah(new Hotel("Hotel C", "Surabaya", 600000, (byte) 5));
        hotelService.tambah(new Hotel("Hotel B", "Blitar", 200000, (byte) 2));
        hotelService.tambah(new Hotel("Hotel B", "Malang", 200000, (byte) 1));
        // Menampilkan semua hotel sebelum diurutkan
        System.out.println("Informasi semua hotel sebelum diurutkan:");
        hotelService.tampilAll();
        System.out.println();

        // Mengurutkan hotel berdasarkan harga menggunakan bubble sort
        hotelService.bubbleSort();

        // Menampilkan semua hotel setelah diurutkan berdasarkan harga
        System.out.println("Informasi semua hotel setelah diurutkan berdasarkan harga:");
        hotelService.tampilAll();
        System.out.println();

        // Mengurutkan hotel berdasarkan bintang menggunakan selection sort
        hotelService.selectionSort();

        // Menampilkan semua hotel setelah diurutkan berdasarkan bintang
        System.out.println("Informasi semua hotel setelah diurutkan berdasarkan bintang:");
        hotelService.tampilAll();
    }
}

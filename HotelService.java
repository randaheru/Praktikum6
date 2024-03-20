public class HotelService {
    Hotel[] rooms;
    int idx;

    // Konstruktor untuk inisialisasi
    public HotelService() {
        rooms = new Hotel[100]; // Misalkan maksimal 100 hotel
        idx = 0;
    }

    // Metode untuk menambahkan hotel ke dalam layanan
    public void tambah(Hotel H) {
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Layanan hotel penuh!");
        }
    }

    // Metode untuk menampilkan semua hotel dalam layanan
    public void tampilAll() {
        for (int i = 0; i < idx; i++) {
            rooms[i].tampilInformasi();
        }
    }

    // Metode bubble sort untuk mengurutkan hotel berdasarkan harga secara ascending
    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tmp;
                }
            }
        }
    }

    // Metode selection sort untuk mengurutkan hotel berdasarkan bintang secara descending
    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (rooms[j].bintang > rooms[idxMax].bintang) {
                    idxMax = j;
                }
            }
            // swap
            Hotel tmp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = tmp;
        }
    }
}

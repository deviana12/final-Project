import java.util.Hashtable;
public class Pelanggan {
    Hashtable<Integer, String> pelanggans;
    // konstruktor
    public Pelanggan() {
        pelanggans = new Hashtable<>();
    }
    // metode menambahkan pelanggan
    public void tambahPelanggan(int nomorMeja, String nama) {
        if (!pelanggans.containsKey(nomorMeja)) {
            pelanggans.put(nomorMeja, nama);
            System.out.println("Pelanggan ditambahkan: " + nama + " (Nomor meja: " + nomorMeja + ")");
        } else {
            System.out.println("Nomor meja " + nomorMeja + " sudah terisi oleh pelanggan lain.");
        }
    }
    // metode menghapus pelanggan
    public void hapusPelanggan(int nomorMeja) {
        if (pelanggans.containsKey(nomorMeja)) {
            String nama = pelanggans.remove(nomorMeja);
            System.out.println("Pelanggan dengan nomor meja " + nomorMeja + " (" + nama + ") dihapus.");
        } else {
            System.out.println("Tidak ada pelanggan dengan nomor meja " + nomorMeja);
        }
    }
    // metode menampilkan pelanggan
    public void printPelanggan(int nomorMeja) {
        String nama = pelanggans.get(nomorMeja);
        if (nama != null) {
            System.out.println("Pelanggan dengan nomor meja " + nomorMeja + ": " + nama);
        } else {
            System.out.println("Tidak ada pelanggan dengan nomor meja " + nomorMeja);
        }
    }
}
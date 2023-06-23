import java.util.Queue;
import java.util.LinkedList;
public class Antrian {
    Queue<String> antrians;
    // konstruktor
    public Antrian(){
        antrians = new LinkedList<>();
    }
    // metode menambahkan antrian
    public void tambahAntrian(String nama){
        antrians.add(nama);
        System.out.println("Antrian "+nama+" berhasil ditambahkan");
    }
    // metode penghapusan antrian
    public void hapusAntrian(){
        if (!antrians.isEmpty()) {
            String antrianPertama = antrians.poll();
            System.out.println("Antrian pertama '" + antrianPertama + "' telah dihapus.");
        } else {
            System.out.println("Antrian kosong. Tidak ada yang dihapus.");
        }
    }
    // metode menampilkan antrian
    public void daftarAntrian(){
        if(!antrians.isEmpty()){
            System.out.println("Daftar Antrian: ");
            for(String nama : antrians){
                System.out.println("- "+nama);
            }
        }else{
            System.out.println("Antrian kosong.");
        }
    }
}
import java.util.LinkedList;
public class Pesanan {
    LinkedList<String> pesanans;
    // konstruktor
    public Pesanan(){
        pesanans = new LinkedList<>();
    }
    // metode menambahkan pesanan
    public void tambahPesan(String pesan){
        pesanans.add(pesan);
        System.out.println("Pesanan: "+pesan);
    }
    // metode menghapus pesanan
    public void hapusPesanan(String pesan){
        boolean hapus = pesanans.remove(pesan);
        if(hapus == true) {
            System.out.println("Pesanan yang dihapus: "+pesan);
        }else{
            System.out.println("Pesanan tidak ditemukan");
        }
    }
    // metode menampilkan pesanan
    public void printPesanan(){
        if(pesanans.isEmpty()){
            System.out.println("Tidak ada pesanan");
        }else{
            System.out.println("Daftar pesanan: ");
            for(int i = 0; i < pesanans.size(); i++) {
                System.out.println("- "+pesanans.get(i));
            }
        }
    }
}
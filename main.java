import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(10);
        Pesanan pesanan = new Pesanan();
        Pelanggan pelanggan = new Pelanggan();
        Antrian antrian = new Antrian();
        menu.tambahMenu("Nasi Goreng");
        menu.tambahMenu("Ayam Bakar");
        int pilihan;
        do{
            System.out.println("==========Restoran U&I==========");
            System.out.println("1. Tambah menu");
            System.out.println("2. Hapus menu");
            System.out.println("3. Daftar menu");
            System.out.println("4. Tambah pelanggan");
            System.out.println("5. Hapus pelanggan");
            System.out.println("6. Daftar Pelanggan");
            System.out.println("7. Tambahkan antrian");
            System.out.println("8. Hapus antrian");
            System.out.println("9. Daftar antrian");
            System.out.println("0. Keluar");
            System.out.println("================================");
            System.out.print("Masukkan pilihan \t : ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Masukkan menu \t\t : ");
                    String namaMenu = scanner.nextLine();
                    menu.tambahMenu(namaMenu);
                    System.out.println("Menu "+namaMenu+" telah ditambahkan");
                    System.out.println("================================");
                    break;
                case 2:
                    menu.printMenu();
                    System.out.print("Masukkan index yang ingin dihapus: ");
                    int index = scanner.nextInt();
                    menu.hapusMenuByIndex(index);
                    System.out.println("================================");
                    break;
                case 3:
                    menu.printMenu();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Masukkan nama \t\t : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nomor meja \t : ");
                    int meja = scanner.nextInt();
                    String namaMenuPelanggan;
                    scanner.nextLine();
                    do {
                        System.out.print("Masukkan menu (0 untuk selesai): ");
                        namaMenuPelanggan = scanner.nextLine();
                        if (!namaMenuPelanggan.equals("0")) {
                            pesanan.tambahPesan(namaMenuPelanggan);
                        }
                    } while (!namaMenuPelanggan.equals("0"));
                    pelanggan.tambahPelanggan(meja, nama);
                    System.out.println("================================");
                    break;
                case 5 :
                    System.out.print("Masukkan nomor meja yang ingin dihapus: ");
                    int mejaHapus = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan menu yang ingin dihapus: ");
                    String menuHapus = scanner.nextLine();
                    pelanggan.hapusPelanggan(mejaHapus);
                    pesanan.hapusPesanan(menuHapus);
                    System.out.println("================================");
                    break;
                case 6:
                    System.out.print("Masukkan nomor meja yang ingin ditampilkan: ");
                    int meja2 = scanner.nextInt();
                    pelanggan.printPelanggan(meja2);
                    pesanan.printPesanan();
                    System.out.println("================================");
                    break;
                case 7 :
                    scanner.nextLine();
                    System.out.print("Masukkan nama \t\t : ");
                    String namaAntri = scanner.nextLine();
                    antrian.tambahAntrian(namaAntri);
                    System.out.println("================================");
                    break;
                case 8:
                    antrian.hapusAntrian();
                    System.out.println("================================");
                    break;
                case 9:
                    antrian.daftarAntrian();
                    System.out.println("================================");
                    break;
                case 0:
                    System.out.println("==========Terimakasih==========");
                    break;
            }
            System.out.println();
        }
        while(pilihan != 0);
    }
}
public class Menu {
    String[] menu;
    int size;
    // konstruktor
    public Menu(int kapasistas){
        menu = new String[kapasistas];
        size = 0;
    }
    // metode tambah menu
    public void tambahMenu(String item){
        if(size < menu.length){
            menu[size] = item;
            size++;
        }else{
            System.out.println("Menu sudah penuh");
        }
    }
    // metode hapus menu berdasarkan index
    public void hapusMenuByIndex(int index) {
        if (index >= 0 && index < size) {
            String menuHapus = menu[index];
            for (int i = index; i < size - 1; i++) {
                menu[i] = menu[i + 1];
            }
            menu[size - 1] = null;
            size--;
            System.out.println("Menu '" + menuHapus + "' telah dihapus.");
        } else {
            System.out.println("Indeks menu tidak valid.");
        }
    }
    // metode menampilkan menu
    public void printMenu(){
        System.out.println("Menu Restoran: ");
        for(int i = 0; i < size; i++){
            System.out.println(i+" "+menu[i]+" ");
            System.out.println("--------------------------------");
        }
    }
}
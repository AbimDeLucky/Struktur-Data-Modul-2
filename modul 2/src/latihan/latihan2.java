package latihan;

import java.util.ArrayList;
import java.util.Iterator;

public class latihan2 {

    public static void main(String[] args) {
        // Membuat objek Hewan dan menambahkan beberapa elemen
        ArrayList<String> hewan = new ArrayList<>();

        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        // Membuat objek DeleteHewan dan menambahkan beberapa elemen
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.println("Hewan : " + hewan);
        System.out.println("hewan yang dihapus : " + DeleteHewan);
        // Menghapus data pada objek hewan yang sama dengan data pada objek DeleteHewan
        Iterator<String> iterator = hewan.iterator();
        while (iterator.hasNext()) {
            String dataHewan = iterator.next();
            if (DeleteHewan.contains(dataHewan)) {
                iterator.remove();
            }
        }
        // Menampilkan elemen pada objek hewan setelah data dihapus
        System.out.println("Output Hewan : " + hewan);
    }
}
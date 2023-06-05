package latihan;

import java.util.ArrayList;

public class molan2 {
    public static void main(String[] args) {
        // Membuat objek ArrayList Hewan
        ArrayList<String> hewan = new ArrayList<String>();

        // Menambahkan data ke objek Hewan
        hewan.add("Kucing");
        hewan.add("Anjing");
        hewan.add("Burung");
        hewan.add("Singa");
        hewan.add("Kuda");
        hewan.add("Kucing");

        // Membuat objek ArrayList DeleteHewan
        ArrayList<String> deleteHewan = new ArrayList<String>();

        // Menambahkan data ke objek DeleteHewan
        deleteHewan.add("Burung");
        deleteHewan.add("Kucing");

        // Menghapus data yang sama pada objek Hewan dengan data pada objek DeleteHewan
        for (int i = 0; i < deleteHewan.size(); i++) {
            String data = deleteHewan.get(i);
            while (hewan.contains(data)) {
                hewan.remove(data);
            }
        }

        // Menampilkan data pada objek Hewan setelah penghapusan
        for (int i = 0; i < hewan.size(); i++) {
            System.out.println(hewan.get(i));
        }
    }
}
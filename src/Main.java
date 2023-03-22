import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // bikin objek Hewan dan DeleteHewan
        List<String> Hewan = new ArrayList<>();
        List<String> DeleteHewan = new ArrayList<>();

        // menambahkan data ke objek Hewan dan DeleteHewan
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        // menampilkan objek Hewan sebelum penghapusan
        System.out.println("Hewan : " + Hewan);

        // melakukan penghapusan data pada objek Hewan yang sama dengan data warna yang terdapat pada objek DeleteHewan
        for (String hewan : DeleteHewan) {
            while (Hewan.contains(hewan)) {
                Hewan.remove(hewan);
            }
        }

        // menampilkan objek DeleteHewan yang dihapus
        System.out.println("Hewan yang dihapus : " + DeleteHewan);

        // menampilkan objek Hewan setelah penghapusan
        System.out.println("Output Hewan : " + Hewan);
    }
}
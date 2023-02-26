import java.util.ArrayList;
import java.util.Arrays;

public class robert {
    public static void main(String[] args) {
        // Daftar yang akan dibeli
        String[] barang = {"cabai", "bayam", "bawang", "tempe", "beras"};

        // Harga masing masing
        int[] harga = {3000, 2000, 3000, 5000, 20000};

        // Uang yang dibawa dina
        int uangdina = 50000;

        // Membuat ArrayList untuk menyimpan barang yang dibeli Dina
        ArrayList<String> barangDibeli = new ArrayList<>();

        // Menghitung total belanja Dina
        int totalBelanja = 0;
        for (int i = 0; i < barang.length; i++) {
            // Jika barang tersebut tidak dibeli Dina
            if (barang[i].equals("cabai")) {
                continue;
            }

            // Jika barang tersebut dibeli Dina
            int hargaBarang = harga[i];
            totalBelanja += hargaBarang;


            barangDibeli.add(barang[i]);
        }

        // Menambahkan barang baru yang dibeli Dina
        barangDibeli.add("ayam");
        barangDibeli.add("minyak");
        totalBelanja += harga[4] + harga[2];

        // Menampilkan daftar catatan Dina
        System.out.println("Daftar catatan Dina: " + Arrays.toString(barang));

        // Menampilkan barang yang dibeli Dina
        System.out.println("Barang yang dibeli Dina: " + barangDibeli);

        // Menampilkan total belanja Dina serta keterangan kurang, pas, atau lebih
        System.out.println("Total belanja Dina: " + totalBelanja);
        if (totalBelanja < uangdina) {
            System.out.println("Kurang " + (uangdina - totalBelanja));
        } else if (totalBelanja == uangdina) {
            System.out.println("Pas");
        } else {
            System.out.println("Lebih " + (totalBelanja - uangdina));
        }
    }
}

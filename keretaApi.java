import java.util.Scanner;

public class keretaApi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket kereta api!");
        System.out.println("Silakan pilih jurusan:");
        System.out.println("1. Cikampek - Tuparev");
        System.out.println("2. Johar - Bypass");
        System.out.println("3. Klari - Badami");
        System.out.print("Masukkan pilihan jurusan (1/2/3): ");
        int jurusan = scanner.nextInt();

        System.out.println("Silakan pilih kelas:");
        System.out.println("1. Business");
        System.out.println("2. Executive");
        System.out.print("Masukkan pilihan kelas (1/2): ");
        int kelas = scanner.nextInt();

        System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = scanner.nextInt();

        int hargaTiket = 0;

        if (jurusan == 1) {
            if (kelas == 1) {
                hargaTiket = 20000;
            } else if (kelas == 2) {
                hargaTiket = 30000;
            }
        } else if (jurusan == 2) {
            if (kelas == 1) {
                hargaTiket = 10000;
            } else if (kelas == 2) {
                hargaTiket = 20000;
            }
        } else if (jurusan == 3) {
            if (kelas == 1) {
                hargaTiket = 15000;
            } else if (kelas == 2) {
                hargaTiket = 25000;
            }
        }

        int totalHarga = jumlahTiket * hargaTiket;
        System.out.println("Total harga tiket: " + totalHarga);
    }
}
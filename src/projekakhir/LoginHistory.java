import java.io.*;
import java.util.*;

public class LoginHistory {
    private static final String FILE_PATH = "login_history.txt"; // File untuk menyimpan riwayat login
    
    // Fungsi untuk menyimpan username ke dalam file
    public static void saveLogin(String username) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(username + " | " + new Date() + "\n");  // Menyimpan username dan waktu login
        } catch (IOException e) {
            System.err.println("Error menyimpan riwayat login: " + e.getMessage());
        }
    }

    // Fungsi untuk mengambil riwayat login (bisa menambahkan filter sesuai kebutuhan)
    public static List<String> getLoginHistory() {
        List<String> history = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error membaca riwayat login: " + e.getMessage());
        }
        return history;
    }

    // Fungsi untuk menampilkan riwayat login di konsol
    public static void showLoginHistory() {
        List<String> history = getLoginHistory();
        if (history.isEmpty()) {
            System.out.println("Tidak ada riwayat login.");
        } else {
            System.out.println("Riwayat Login Pengguna:");
            for (String record : history) {
                System.out.println(record);  // Menampilkan setiap entri riwayat
            }
        }
    }

    // Fungsi untuk menghapus riwayat login (opsional)
    public static void clearLoginHistory() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(""); // Menulis ulang file untuk menghapus isinya
        } catch (IOException e) {
            System.err.println("Error menghapus riwayat login: " + e.getMessage());
        }
    }
}

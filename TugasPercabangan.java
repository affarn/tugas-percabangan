import java.util.Scanner;

public class tugas1alpro {

    public static void main(String[] args) {
        // Deklarasi variabel
        int gajiPokok = 5000000;
        int uangLembur = 50000;
        int masaKerja;
        int waktuKerja;
        int waktuLembur;
        double bonus;
        double totalGaji;

        // Scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Input dari user
        System.out.print("Masukkan masa kerja: ");
        masaKerja = scanner.nextInt();
        System.out.print("Masukkan jumlah jam kerja: ");
        waktuKerja = scanner.nextInt();

        // Hitung tambahan berdasarkan masa kerja
        if (masaKerja < 5) {
            bonus = 0;
        } else if (masaKerja >= 5 && masaKerja <=10)
            bonus = gajiPokok * 0.05; //  5%
        else if (masaKerja >= 10 && masaKerja <=20) {
            bonus = gajiPokok * 0.10; // bonus 10%;
        } else {
            bonus = gajiPokok * 0.20;
        }

        // Hitung waktu lembur
        if (waktuKerja > 240) { // 240 jam = 8jam/hari = 30 hari
            waktuLembur = waktuKerja - 240;
        } else {
            waktuLembur = 0;
        }

        // Hitung total gaji
        totalGaji = gajiPokok + bonus + (waktuLembur * uangLembur);
        
        // Hasil
        System.out.println("Total gaji yang didapat: Rp " + totalGaji);

        // Tutup Scanner
        scanner.close();

        
    
    }
}
 // Program hitung lama kerja dan total jam kerja

    // Deklarasi

        // Var gaji pokok = 5000000, uangLembur = 50000, lamaKerja, totalJamKerja, totalJamLembur.; integer;
        //      totalGaji, bonus,; double;

    // Algoritma

    //  input (lamaKerja);
    //  input (totalJamKerja);

    // if masaKerja < 5 then
    output (bonus = 0);
    else if masaKerja >= 5 and masaKerja <= 10 then
    output (bonus = gajiPokok = 0.05);
    else if masaKerja > 10 then
    output (bonus = gajiPokok = 0.10);
    end if
    
    // if totalJamKerja > 160 then
    output(totalJamLembur = totalJamKerja - 160);
    else 
        totalJamLembur = 0;
    end if

    //  output (totalGaji = gajiPokok * bonus + (TotalJamLembur * uangLembur);

    //End

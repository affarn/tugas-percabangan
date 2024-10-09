import java.util.Scanner;

public class TugasPercabangan {

    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int gajiPokok = 5000000;
        double gajiAkhir, tambahan;
        int uangLemburPerJam = 50000;
        int jamLembur, masaKerja, jamKerja;
        
        System.out.print("Masukkan masa kerja (dalam tahun): ");
        masaKerja = scanner.nextInt();
        System.out.print("Masukkan total jam kerja dalam 1 bulan: ");
        jamKerja = scanner.nextInt();

        if (jamKerja > 40) { // 240 jam = 8 jam/hari * 30 hari
            jamLembur = jamKerja - 40;
        } else {
            jamLembur = 0;
        }

        
        if (masaKerja < 5) {
            tambahan = 0;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            tambahan = gajiPokok * 0.05; // Tambahan 5%
        } else {
            tambahan = gajiPokok * 0.10; // Tambahan 10%
        }

        // Hitung gaji akhir
        gajiAkhir = gajiPokok + tambahan + (uangLemburPerJam*jamLembur);

        // Tampilkan hasil perhitungan
        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Tambahan gaji: Rp " + tambahan);
        System.out.println("Uang lembur: Rp " + uangLemburPerJam*jamLembur);
        System.out.println("Gaji total yang diterima: Rp " + gajiAkhir);
        
        scanner.close();
    }
}


/* 
        Program Perhitungan Gaji Karyawan

            Deklarasi
                Var uangLemburPerJam = 50000,
                    jamKerjaPerHari = 8
                    jamKerjaPerMinggu = 40,
                    totalJamKerja,
                    jamKerjaPerBulan = jamKerjaPerMinggu * 4 // 160 jam per bulan
                    masaKerja,
                    : integer;
                    gajiPokok = 5000000,
                    tambahanGaji = 0,
                    uangLembur = 0,
                    gajiAkhir,
                    : double;
                    

            Algoritma
                input (masaKerja);
                input (totalJamKerja);

                if masaKerja >= 5 and masaKerja <= 10 then
                    output (tambahanGaji = 0.05 * gajiPokok);  // 5% tambahan
                else if masaKerja > 10 then
                    output (tambahanGaji = 0.10 * gajiPokok);  // 10% tambahan
                end if

                if totalJamKerja > jamKerjaPerBulan then
                    output (uangLembur = (totalJamKerja - jamKerjaPerBulan) * uangLemburPerJam);


                output (gajiPokok)
                output (tambahanGaji)
                output (uangLembur)
                output (gajiAkhir = gajiPokok + tambahanGaji + uangLembur);

            End
        


        */

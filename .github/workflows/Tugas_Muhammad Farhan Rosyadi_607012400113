import java.util.Scanner;

public class TugasPercabangan {
    public static void main(String[] args){
        int gajiPokok = 5000000;
        int uangLembur = 50000;
        int lamaKerja, totalJamKerja, totalJamLembur;
        double totalGaji;
        double bonus;
        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Masa Kerja :");
        lamaKerja       = scanner.nextInt();
        System.out.print("Masukan Jumlah Jam Kerja :");
        totalJamKerja  = scanner.nextInt();

        if (lamaKerja < 5){
            bonus = 0;
        } else if (lamaKerja >=5 && lamaKerja <=10){
            bonus = gajiPokok * 0.05;
        } else {
            bonus = gajiPokok * 0.10;
        }

        if (totalJamKerja > 40) {
            totalJamLembur = totalJamKerja - 40;
        } else {
            totalJamLembur = 0;
        }

        totalGaji = gajiPokok + bonus + (totalJamLembur * uangLembur);
        System.out.println("Total Gaji :" + totalGaji);

        scanner.close();
    }
}

// Deklarasi
// Var gajiPokok = 5000000;
// uangLembur = 50000;
// masaKerja;
// jamKerja;
// jumlahJamKerja;
// jumlahJamLembur;
// : integer;
// totalGaji;
// bonus;
// : double;

// Algoritma
// input(masaKerja);
// input(jamKerja);
// if (masa kerja <5 tahun) then
// output (bonus = 0);
// else if (masa kerja>= 5 && masaKerja <= 10 ) then
// output (bonus = 0,05 *uangLembur);
// else(masa kerja > 10 tahun) then
// output (bonus = 0,01)

// End

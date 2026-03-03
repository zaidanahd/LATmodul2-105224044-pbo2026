import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---Program Penghitung Gaji---");
        System.out.print("Masukkan Nama Karyawan   : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Gaji Pokok      : ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        double upahLemburPerJam = gajiPokok / 173;
        double totalUangLembur = jamLembur * upahLemburPerJam;
        double gajiKotor = gajiPokok + totalUangLembur;
        double pajak = 0.05 * gajiKotor;
        double bpjs = 0.01 * gajiPokok;
        double gajiBersih = gajiKotor - pajak - bpjs;

        System.out.println("\n========================================");
        System.out.println("Rincian Gaji untuk: " + nama);
        System.out.println("----------------------------------------");
        System.out.printf("Gaji Pokok          : Rp %.2f\n", gajiPokok);
        System.out.printf("Total Uang Lembur   : Rp %.2f (%d jam)\n", totalUangLembur, jamLembur);
        System.out.printf("Gaji Kotor (Bruto)  : Rp %.2f\n", gajiKotor);
        System.out.println("----------------------------------------");
        System.out.printf("Potongan Pajak (5%%) : Rp %.2f\n", pajak);
        System.out.printf("Potongan BPJS (1%%)  : Rp %.2f\n", bpjs);
        System.out.println("----------------------------------------");
        System.out.printf("GAJI BERSIH (NETTO) : Rp %.2f\n", gajiBersih);
        System.out.println("========================================");
        input.close();
    }
}
import java.util.Scanner;

public class LatihanModul2 {
    public static void main(String[] args) throws Exception {
        String nama = " ZAIDAN " ;
        
        
        int a = 2; int b = 10;
        int c = 3; int d = 20;
        double hasil = d/c;

        System.out.println("hasil perkalian 2 dan 3= " + (a*b));
        System.out.println("hasil pembagian 20 dan 3 = " + (d/c));
        System.out.println("hasil pembagian 20 dan 3 = " + ((double)d/c));
        System.out.println("hasil pembagian 20 dan 3 = " + hasil );
        System.out.println("modulus = " + (d%c));

        Scanner input = new Scanner(System.in);

        System.out.println("masukkan tanggal Lahir = ");
        int tanggalLahir = input.nextInt();

        input.nextLine();

        System.out.println("masukkan nama Lengkap = ");
        String namaLengkap = input.nextLine();

        System.out.println(nama + " " + tanggalLahir);
        input.close();

        


    }
}

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print( " masukkan panjang = ");
        Double panjang = input.nextDouble();

        System.out.print( "masukkan lebar = ");
        Double lebar = input.nextDouble();

        System.out.print("masukkan tinggi = ");
        Double tinggi = input.nextDouble();

        Double luaspermukaan = 2*tinggi * (panjang + lebar);

        Double cat = luaspermukaan/10;

        Double literakhir = Math.ceil(cat);

        System.out.println("Luas permukaan = " + luaspermukaan + "m2");
        System.out.println("Cat yang di butuhkan = " + literakhir + " liter");

        input.close();

    }
}

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print( " masukkan suhu Celcius = ");
        Double C = input.nextDouble();

        Double F = 9/5 *C + 32;
        Double K = C + 273;
        Double R = 4.0/5.0 *C;

        System.out.println("nilai Fahrenheit = " + F );
        System.out.println("nilai Kelvin = " + K );
        System.out.println("Nilai Reamur = " + R );

        input.close();

    }
}


import java.util.Scanner;

public class DaireHesaplamaProgrami  {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Dairenin Yari capini Girin: ");
        double yariCap = scanner.nextDouble();
        final double pi = 3.14;

        
        double alan = pi * yariCap * yariCap;
        System.out.println("Dairenin Alani: " + alan);


        double cevre = 2 * pi * yariCap;
        System.out.println("Dairenin cevresi: " + cevre);

        scanner.close();
    }
}

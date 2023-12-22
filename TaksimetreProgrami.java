import java.util.Scanner;

public class TaksimetreProgrami  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gidilen Mesafe (KM): ");
        double mesafe = scanner.nextDouble();
        double BaslangicUcreti = 10.0;  
        double kmBasinaTutar = 2.20; 
        double minOdeme = 20.0; 
        double taksimetreTutar = BaslangicUcreti + (mesafe * kmBasinaTutar);
        if (taksimetreTutar < minOdeme) {
           
             System.out.println("Taksimetre Tutari: " + minOdeme + " TL");
        }else {
             System.out.println("Taksimetre Tutari: " + taksimetreTutar + " TL");
        }
        scanner.close();
    }
}

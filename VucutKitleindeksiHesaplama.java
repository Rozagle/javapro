import java.util.Scanner;

public class VucutKitleindeksiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
      
        double vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vucut Kitle indeksiniz: " + vucutKitleIndeksi);

        scanner.close();
    }
}

import java.util.Scanner;

public class HipotenüsVeAlanHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dik kenar uzunluklarını alma
        System.out.print("1. Dik Kenar Uzunluğu (a): ");
        double a = scanner.nextDouble();

        System.out.print("2. Dik Kenar Uzunluğu (b): ");
        double b = scanner.nextDouble();

        // Hipotenüsü hesapla
        double hipotenüs = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenüs: " + hipotenüs);

        // Üçgenin alanını hesapla
        double u = (a + b + hipotenüs) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - hipotenüs));
        System.out.println("Üçgenin Alanı: " + alan);

        scanner.close();
    }
}

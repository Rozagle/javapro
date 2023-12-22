import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        
        final double KDVORANI1 = 0.18;  // %18
        final double KDVORANI2 = 0.08;  // %8
        final double KDVSIZFIYAT = 10.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen para degerini giriniz: ");
        double paraDegeri = scanner.nextDouble();
        double kdvOrani = (paraDegeri <= 1000) ? KDVORANI1 : KDVORANI2;
        double kdvliFiyat = KDVSIZFIYAT + (KDVSIZFIYAT * kdvOrani);
        double kdvTutari = KDVSIZFIYAT * kdvOrani;
        System.out.println("KDVsiz Fiyat: " + KDVSIZFIYAT + " TL");
        System.out.println("KDV Orani: %" + (kdvOrani * 100));
        System.out.println("KDVli Fiyat: " + kdvliFiyat + " TL");
        System.out.println("KDV Tutari: " + kdvTutari + " TL");
        scanner.close();
    }
}

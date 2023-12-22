import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dogruSifre = "sifre123";

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();

        if (sifreKontrol(girilenSifre, dogruSifre)) {
            System.out.println("Giriş başarılı.");
        } else {
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String sifreSifirla = scanner.nextLine().toLowerCase();

            if (sifreSifirla.equals("evet")) {
                sifreOlustur(girilenSifre);
                System.out.print("Şifrenizi giriniz: ");
                 girilenSifre = scanner.nextLine();
                 System.out.println("Giriş başarılı.");
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }

    private static boolean sifreKontrol(String girilenSifre, String dogruSifre) {
        return girilenSifre.equals(dogruSifre);
    }

    private static void sifreOlustur(String unuttugunSifre) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yeni şifrenizi giriniz: ");
        String yeniSifre = scanner.nextLine();

        if (yeniSifre.equals(unuttugunSifre)) {
            System.out.println("Hata: Yeni şifre, unuttuğunuz şifre ile aynı olamaz.");
        } else {
            System.out.println("Şifre oluşturuldu.");
        }
    }
}

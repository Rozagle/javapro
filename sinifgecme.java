import java.util.Scanner;

public class sinifGecmeDurumu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int toplamNot = 0;
        int dersSayisi = 0;

        for (String ders : dersler) {
            System.out.print(ders + " notunuzu giriniz: ");
            int not = scanner.nextInt();

            if (not >= 0 && not <= 100) {
                toplamNot += not;
                dersSayisi++;
            } else {
                System.out.println("Hata: " + ders + " notu 0 ile 100 arasında olmalıdır.");
            }
        }

        if (dersSayisi > 0) {
            int ortalama = toplamNot / dersSayisi;

            System.out.println("Ortalama not: " + ortalama);

            int gecmeNotu = 55;

            if (ortalama >= gecmeNotu) {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            } else {
                System.out.println("Üzgünüz, sınıfı geçemediniz.");
            }
        } else {
            System.out.println("Hesaplama yapılamadı, geçerli not girilmedi.");
        }
    }
}


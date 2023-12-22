import java.math.*;
public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("İşlemi seçiniz (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double sonuc;

        switch (operator) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("Toplam: " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("Fark: " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("Çarpım: " + sonuc);
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Bölüm: " + sonuc);
                } else {
                    System.out.println("Hata! Sıfıra bölme hatası.");
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
        }

        scanner.close();
    }

}

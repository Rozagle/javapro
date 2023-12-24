import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("sayi giriniz: ");
        int j = scanner.nextInt();

        System.out.print("n'i giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r'i giriniz: ");
        int r = scanner.nextInt();

        long kombinasyon = hesaplaKombinasyon(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
        
        System.out.print("Faktoriyel "   + faktoriyel(j));


        scanner.close();
    }

    // Faktöriyel hesaplayan metot
    public static long faktoriyel(int sayi) {
        if (sayi == 0 || sayi == 1) {
            return 1;
        }
        return sayi * faktoriyel(sayi - 1);
    }

    // Kombinasyon hesaplayan metot
    public static long hesaplaKombinasyon(int n, int r) {
        if (n < r) {
            return 0;
        }
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }
}

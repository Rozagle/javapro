import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TekrarEdenCiftleriBul {

    public static List<Integer> tekrarEdenCiftleriBul(int[] sayiDizisi) {
        Set<Integer> tekrarEdenler = new HashSet<>();
        Set<Integer> sayilar = new HashSet<>();

        for (int sayi : sayiDizisi) {
            if (sayilar.contains(sayi)) {
                tekrarEdenler.add(sayi);
            } else {
                sayilar.add(sayi);
            }
        }

        return new ArrayList<>(tekrarEdenler);
    }

    public static void main(String[] args) {
        int[] sayiDizisi = {1, 2, 3, 4, 5, 2, 6, 7, 8, 8, 9};
        List<Integer> tekrarEdenCiftler = tekrarEdenCiftleriBul(sayiDizisi);

        System.out.print("Tekrar eden çift sayılar: ");
        for (int sayi : tekrarEdenCiftler) {
            System.out.print(sayi + " ");
        }
    }
}

import java.util.HashMap;
import java.util.Map;

public class FrekansBulucu {

    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        Map<Integer, Integer> frekanslar = frekanslariBul(dizi);

        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            int sayi = entry.getKey();
            int frekans = entry.getValue();
            System.out.println(sayi + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }

    public static Map<Integer, Integer> frekanslariBul(int[] dizi) {
        Map<Integer, Integer> frekanslar = new HashMap<>();

        for (int sayi : dizi) {
            if (frekanslar.containsKey(sayi)) {
                frekanslar.put(sayi, frekanslar.get(sayi) + 1);
            } else {
                frekanslar.put(sayi, 1);
            }
        }

        return frekanslar;
    }
}

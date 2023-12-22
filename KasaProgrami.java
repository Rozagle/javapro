import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, Double> urunFiyatlari = new HashMap<>();
        urunFiyatlari.put("Armut", 2.14);
        urunFiyatlari.put("Elma", 3.67);
        urunFiyatlari.put("Domates", 1.11);
        urunFiyatlari.put("Muz", 0.95);
        urunFiyatlari.put("Patlıcan", 5.00);
        
        double toplamTutar = 0.0;
         String meyveAdi = "";

   while(true){
            System.out.print("Pöşete ürün eklemek ister misiniz? (Evet/Hayır): ");
            String response = scanner.next().toUpperCase() ;
            
            if (response.equalsIgnoreCase("Hayır")) {
                System.out.println("Siparişiniz başarıyla Tamamlandi.");
                break;
            } else if (response.equalsIgnoreCase("Evet")) {
                System.out.print("Meyve Adı: ");
                meyveAdi = scanner.next();
                String meyveismi = meyveAdi.substring(0, 1).toUpperCase() + meyveAdi.substring(1);


                if (urunFiyatlari.containsKey(meyveismi)) {
                    System.out.print(meyveismi + " (kg): ");
                    double kg = scanner.nextDouble();
                    
                    toplamTutar += kg * urunFiyatlari.get(meyveismi);
                } else {
                    System.out.println("Geçersiz meyve adı, tekrar deneyiniz.");
                }
            } else {
                System.out.println("Geçersiz yanıt, lütfen 'Evet' veya 'Hayır' giriniz.");
                
       }   
}
System.out.println("Toplam Tutar: " + toplamTutar + " TL");    
scanner.close();
       
    }
}

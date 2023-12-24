import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
	  

        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int n = input.nextInt();

        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Negatif bir sayı girdiniz. Pozitif bir sayı giriniz.");
        }
        
    }

}

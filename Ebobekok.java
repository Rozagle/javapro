import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = input.nextInt();

        int smaller, greater, temp;
        int ebob = 1; // En Büyük Ortak Bölen
        int ekok; // En Küçük Ortak Kat

        if (num1 > num2) {
            greater = num1;
            smaller = num2;
        } else {
            greater = num2;
            smaller = num1;
        }

        // EBOB Hesaplama
        temp = smaller;
        while (temp >= 1) {
            if (num1 % temp == 0 && num2 % temp == 0) {
                ebob = temp;
                break;
            }
            temp--;
        }

        // EKOK Hesaplama
        ekok = (num1 * num2) / ebob;

        System.out.println("EBOB(" + num1 + "," + num2 + ") = " + ebob);
        System.out.println("EKOK(" + num1 + "," + num2 + ") = " + ekok);
    }
}

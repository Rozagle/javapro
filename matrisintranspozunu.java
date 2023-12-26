public class Main {

    public static void main(String[] args) {
        int[][] matris1 = {
            {2, 3, 4},
            {5, 6, 4}
        };

        int[][] matris2 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Matris 1:");
        matrisiYazdir(matris1);
        System.out.println("Transpoze 1:");
        matrisiYazdir(transpozAl(matris1));

        System.out.println("\nMatris 2:");
        matrisiYazdir(matris2);
        System.out.println("Transpoze 2:");
        matrisiYazdir(transpozAl(matris2));
    }

    public static int[][] transpozAl(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        return transpozMatris;
    }

    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "    ");
            }
            System.out.println();
        }
    }
}

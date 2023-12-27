import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private char[][] mineField;
    private char[][] revealedField;
    private int rows;
    private int cols;
    private int totalMines;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.mineField = new char[rows][cols];
        this.revealedField = new char[rows][cols];
        this.totalMines = rows * cols / 4; // Mayın sayısı elemanSayisi / 4 kadar olmalı

        initializeMineField();
        initializeRevealedField();
    }

    private void initializeMineField() {
        Random random = new Random();
        int minesPlaced = 0;

        while (minesPlaced < totalMines) {
            int randomRow = random.nextInt(rows);
            int randomCol = random.nextInt(cols);

            if (mineField[randomRow][randomCol] != '*') {
                mineField[randomRow][randomCol] = '*';
                minesPlaced++;
            }
        }
    }

    private void initializeRevealedField() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                revealedField[i][j] = '-';
            }
        }
    }

    private void printField(char[][] field) {
        System.out.println("===========================");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private void revealMines() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineField[i][j] == '*') {
                    revealedField[i][j] = '*';
                }
            }
        }
        printField(revealedField);
    }

    private int countSurroundingMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidMove(i, j) && mineField[i][j] == '*') {
                    count++;
                }
            }
        }
        return count;
    }

    private void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printField(revealedField);

            System.out.print("Satır Giriniz : ");
            int row = scanner.nextInt();

            System.out.print("Sütun Giriniz : ");
            int col = scanner.nextInt();

            if (!isValidMove(row, col)) {
                System.out.println("Geçersiz koordinatlar. Lütfen tekrar girin.");
                continue;
            }

            if (revealedField[row][col] != '-') {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (mineField[row][col] == '*') {
                revealMines();
                System.out.println("Game Over!!");
                break;
            } else {
                int surroundingMines = countSurroundingMines(row, col);
                revealedField[row][col] = (char) (surroundingMines + '0');

                // Check for winning condition
                boolean won = true;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (mineField[i][j] != '*' && revealedField[i][j] == '-') {
                            won = false;
                            break;
                        }
                    }
                    if (!won) {
                        break;
                    }
                }

                if (won) {
                    printField(revealedField);
                    System.out.println("Oyunu Kazandınız !");
                    break;
                }
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        MineSweeper game = new MineSweeper(3, 3);
        game.playGame();
    }
}

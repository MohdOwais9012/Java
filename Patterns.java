import java.util.Stack;

public class Patterns {
    public static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern5(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n - 1; row++) {
            // for every row, run the col
            for (int col = 2; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();

        }
        System.out.println();
    }
    static void pattern7(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row: row;
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= c; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int row = 0; row < 2 * n - 1; row++) {
            for (int col = 0; col < 2 * n - 1; col++) {
                int ateveryIndex = 4543;
                System.out.println(ateveryIndex);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);

    }
}

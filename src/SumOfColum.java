import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int col;
        do {

            System.out.println("Cot nao ban muon tinh tong? ");
            col = scanner.nextInt();
            if (col > 2) {
                System.out.println("Nhap 0 hoac 1 hoac 2 ");
            }
        }
        while (col>2);
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("tong cua hang thu " + col + " la " + sum(arr,col));
    }

    public static int sum(int[][] arr, int col) {
        int sum = 0;
        switch (col) {
            case 0:
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][0];
                }
                break;
            case 1:
                for (int i = 0; i < arr.length ; i++) {

                    sum += arr[i][1];
                }
                break;
            case 2:
                for (int i = 0; i < arr.length ; i++) {
                    sum += arr[i][2];
                }
                break;
        }
        return sum;
    }
}
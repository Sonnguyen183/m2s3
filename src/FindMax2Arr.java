import java.util.Scanner;

public class FindMax2Arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mang nhap va0 co so hang:");
        int m = input.nextInt();
        System.out.println("Mang nhap vao co so cot:");
        int n = input.nextInt();
        int [] [] array = new int[m][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[j].length; j++){
                System.out.printf("Nhap vao gia tri o vi tri %d x %d la:", i, j);
                array[i] [j] = input.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i <array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (max < array[i][j]) max = array[i][j];
            }
        }
        System.out.print("Gia tri lon nhat cua mang 2 chieu la:");
        System.out.println(max);

    }
}
